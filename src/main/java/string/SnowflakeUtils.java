package string;

import org.apache.commons.io.IOUtils;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class SnowflakeUtils {
    /**
     * 起始的时间戳,  2022-02-22 22:22:22
     */
    private final static long START_STMP = 1645539742000L;

    /**
     * 每一部分占用的位数
     */
    private final static long SEQUENCE_BIT = 12; //序列号占用的位数
    private final static long MACHINE_BIT = 5;   //机器标识占用的位数  31
    private final static long DATACENTER_BIT = 5;//数据中心占用的位数  31

    /** 数据中心 - 最大值31 */
    private final static long MAX_DATACENTER_NUM = 31;
    /** 机器标识 - 最大值31 */
    private final static long MAX_MACHINE_NUM = 31;
    /** 时间戳序列 - 最大值4095 */
    private final static long MAX_SEQUENCE = 4095;

    /** 机器标识 - 左移4位 */
    private final static long MACHINE_LEFT = 12;
    /** 数据中心 - 左移8位 */
    private final static long DATACENTER_LEFT = 12 + 5;
    /** 时间戳 - 左移22位 */
    private final static long TIMESTMP_LEFT = 17 + 5;

    /** 数据中心 */
    private final long datacenterId;
    /** 机器标识 */
    private final long machineId;
    /** 序列号 */
    private long sequence = 0L;
    /** 上一次时间戳 */
    private long lastStmp = -1L;

    private static SnowflakeUtils INSTANCE;

    public static SnowflakeUtils getInstance() {
        if(INSTANCE != null) {
            return INSTANCE;
        }

        synchronized (SnowflakeUtils.class) {
            if(INSTANCE != null) {
                return INSTANCE;
            }

            int datacenterId;
            int machineId;
            try(InputStream resourceAsStream = SnowflakeUtils.class.getResourceAsStream("/snowflake.machineId")) {
                String s = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8);
                String[] split = s.trim().split(",");
                datacenterId = Integer.parseInt(split[0].trim());
                machineId = Integer.parseInt(split[1].trim());
            } catch (Exception e) {
                datacenterId = 1;
                machineId = 1;
            }

            INSTANCE = new SnowflakeUtils(datacenterId, machineId);
        }
        return INSTANCE;
    }

    public SnowflakeUtils(long datacenterId, long machineId) {
        if (datacenterId > MAX_DATACENTER_NUM || datacenterId < 0) {
            throw new IllegalArgumentException("datacenterId can't be greater than MAX_DATACENTER_NUM or less than 0");
        }
        if (machineId > MAX_MACHINE_NUM || machineId < 0) {
            throw new IllegalArgumentException("machineId can't be greater than MAX_MACHINE_NUM or less than 0");
        }
        this.datacenterId = datacenterId;
        this.machineId = machineId;
    }

    public static long nextId() {
        return getInstance().nextId0();
    }

    /**
     * 产生下一个ID
     *
     * @return
     */
    public synchronized long nextId0() {
        long currStmp = getNewstmp();
        if (currStmp < lastStmp) {
            throw new RuntimeException("Clock moved backwards.  Refusing to generate id");
        }

        if (currStmp == lastStmp) {
            //相同毫秒内，序列号自增
            sequence = (sequence + 1) & MAX_SEQUENCE;
            //同一毫秒的序列数已经达到最大
            if (sequence == 0L) {
                currStmp = getNextMill();
            }
        } else {
            //不同毫秒内，序列号置为0
            sequence = 0L;
        }

        lastStmp = currStmp;

        return (currStmp - START_STMP) << TIMESTMP_LEFT //时间戳部分
                | datacenterId << DATACENTER_LEFT       //数据中心部分
                | machineId << MACHINE_LEFT             //机器标识部分
                | sequence;                             //序列号部分
    }

    private long getNextMill() {
        long mill = getNewstmp();
        while (mill <= lastStmp) {
            mill = getNewstmp();
        }
        return mill;
    }

    private long getNewstmp() {
        return System.currentTimeMillis();
    }

    public static void main(String[] args) {
        SnowflakeUtils snowFlake = new SnowflakeUtils(31, 31);
        System.out.println(~(-1L << 5));
        for (int i = 0; i < (1 << 12); i++) {
            System.out.println(snowFlake.nextId0());
        }

    }
}

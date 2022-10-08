package string;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Time_test {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("HH:mm");//设置日期格式
//初始化
        Date nowTime =null;
        Date beginTime = null;
        Date endTime = null;
        try {
            //格式化当前时间格式
            nowTime = df.parse(df.format(new Date()));
            //定义开始时间
            beginTime = df.parse("15:00");
            //定义结束时间
            endTime = df.parse("15:55");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //调用判断方法
        boolean flag = belongCalendar(nowTime, beginTime, endTime);
        //输出为结果
        if(flag){
            //处于规定的时间段内，执行对应的逻辑代码
            System.out.println(flag);
        }else{
            //不处于规定的时间段内，执行对应的逻辑代码
            System.out.println(flag);
        }

    }


    /**
     * 判断时间是否在时间段内
     * @param nowTime  当前时间
     * @param beginTime   开始时间
     * @param endTime     结束时间
     * @return
     */
    public static boolean belongCalendar(Date nowTime, Date beginTime, Date endTime) {
        //设置当前时间
        Calendar date = Calendar.getInstance();
        date.setTime(nowTime);
        //设置开始时间
        Calendar begin = Calendar.getInstance();
        begin.setTime(beginTime);
        //设置结束时间
        Calendar end = Calendar.getInstance();
        end.setTime(endTime);
        //处于开始时间之后，和结束时间之前的判断
        if (date.after(begin) && date.before(end)) {
            return true;
        } else {
            return false;
        }
    }
}

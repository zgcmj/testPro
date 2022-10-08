package data;

import objectMethod.B;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataTest2 {

    @Test
    public void test() {


        Date now = new Date(1654185600);
        Date start = new Date(1656604800);
        Date end = new Date(1662109360);
        boolean b = belongCalendar(now, start, end);
        System.out.println(b);

    }

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

    @Test
    public void test2() {

        Date date = new Date();
        long time = date.getTime();
        System.out.println(time / 1000);

    }
    @Test
    public void test3() throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse("2022-06-01");
        Date date = new Date();
        long time = date.getTime();
        System.out.println(parse.getTime() / 1000);

    }

}

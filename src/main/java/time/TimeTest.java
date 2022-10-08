package time;

import org.junit.Test;

public class TimeTest {


    @Test
    public  void test(){
        Long l = 1641587453000l;
        int time = 60*60;
        System.out.println(time);
        long result = 1641587453000l%time;
        System.out.println(result);
        long s = result/60/60;
        System.out.println(s);

    }
    @Test
    public  void test2(){
        System.out.println(600*24);
    }


}

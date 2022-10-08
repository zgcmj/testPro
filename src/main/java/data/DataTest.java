package data;

import org.apache.commons.lang3.time.DateUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;

public class DataTest {

    public static void main(String[] args) {

        Calendar instance = Calendar.getInstance();
        long timeInMillis = instance.getTimeInMillis();
        System.out.println(timeInMillis);
        //instance.get();
        String calendarType = instance.getCalendarType();
        System.out.println(calendarType);
        int weeksInWeekYear = instance.getWeeksInWeekYear();
        System.out.println(weeksInWeekYear);
        int i = 365 / 7;
        System.out.println(i);
        int weekYear = instance.getWeekYear();
        System.out.println(weekYear);
        int firstDayOfWeek = instance.getFirstDayOfWeek();
        System.out.println(firstDayOfWeek);


        Date  data = new Date();
        long time = data.getTime();

        InputStreamReader inputStreamReader = new InputStreamReader(new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        });
        String encoding = inputStreamReader.getEncoding();


        System.out.println(data);
    }
}

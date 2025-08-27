package date_time_ques;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ans1 {
    public static void main(String[] args) {
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH:mm:ss z");

        //gmt
        ZonedDateTime gmtTime=ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println(gmtTime.format(formatter));

        //ist
        ZonedDateTime istTime=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(istTime.format(formatter));

        ZonedDateTime pstTime=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(pstTime.format(formatter));

        
    }
}

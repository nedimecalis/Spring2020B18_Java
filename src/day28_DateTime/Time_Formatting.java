package day28_DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_Formatting {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");//ss yazmayinca second cikmiyo

        LocalTime time1 = LocalTime.of(16,13);//eger saat yerine 12,den kucuk yazarsak otomatik olarak am'e donusecek

        System.out.println(time1.format(dtf));

        LocalTime time2 = LocalTime.of(10,46,30);

        System.out.println(time2.format(dtf));

        LocalTime time3 = LocalTime.of(12,00,00);

        System.out.println(time3.format(dtf));

        LocalTime time4 = LocalTime.of(00,00);

        System.out.println(time4.format(dtf));


        boolean result1 = time1.isAfter(time2);
        System.out.println(result1);



    }

}

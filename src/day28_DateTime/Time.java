package day28_DateTime;

import java.time.LocalTime;
import java.time.LocalDate;

public class Time {

    public static void main(String[] args) {

        LocalTime time1= LocalTime.now();

        System.out.println(time1);

        LocalTime time2 = LocalTime.of(23,30,45);//localtime 24 saat uzerinden
        System.out.println(time2);


    }


}

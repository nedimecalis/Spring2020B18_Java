package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime_Formating {

    public static void main(String[] args) {

        LocalDateTime datetime1 = LocalDateTime.of(1980,11,06,11,30,45);

        System.out.println(datetime1);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a, EEE");//buraya ne yazarsak o sekilde print olur

        System.out.println(datetime1.format(dtf));

        //String str =datetime1.format(dtf); --> Eger mesela Hour: 12, Minute: 33 yazicaz srting manipulation kullanicaz
        //System.out.println(str);

    }
}

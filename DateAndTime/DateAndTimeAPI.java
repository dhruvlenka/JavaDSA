package DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.DayOfWeek;
import java.time.Month;

public class DateAndTimeAPI {
    public static void main(String[] args) {
        System.out.println("Date And Time API");

        //printing the date
        System.out.println("-------- Date ---------");
        LocalDate date = LocalDate.now();
        System.out.println(date);

        //printing date and time
        System.out.println("-------- Date AND Time ---------");
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);


        //printing day of the week
        LocalDate  date2 = LocalDate.now();
        DayOfWeek dayofWeek = date2.getDayOfWeek();
        System.out.println(dayofWeek);

        //printing month of the year
        Month month = date2.getMonth();
        System.out.println(month);
    }
}

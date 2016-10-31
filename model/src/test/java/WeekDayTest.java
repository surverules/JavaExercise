import com.backend.WeekDay;

import java.util.Enumeration;

/**
 * Created by surverules on 10/30/2016.
 */
public class WeekDayTest {

    public static void main(String[] args) {

        WeekDay weekday = WeekDay.valueOf("JANUARY");
        System.out.println("No Of Days:  " + weekday.getDay() + " in Month : " + weekday.name() + " of Year " + weekday.getYear());

        System.out.println("In a Loop: ");
        for (WeekDay weekDay1 : weekday.values()){

            System.out.println("No of days in: " + weekDay1.getDay() + " in Year: " + weekday.getYear() + " in Month: " + weekDay1.name());
        }
        System.out.println("Loop Ended");
    }
}

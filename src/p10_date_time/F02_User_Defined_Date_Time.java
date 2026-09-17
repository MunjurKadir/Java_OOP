package p10_date_time;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.Period;
import java.time.Duration;
public class F02_User_Defined_Date_Time {
    public static void main (String[] args){
        LocalDate Birthday = LocalDate.of(2004, 07, 27);  // LocalDate.of(year, month, day)
        System.out.println("My birthday is: " + Birthday);
        // Take individual info from date
        System.out.println(Birthday.getYear());
        System.out.println(Birthday.getMonth());
        System.out.println(Birthday.getMonthValue());
        System.out.println(Birthday.getDayOfMonth());

        LocalTime time = LocalTime.of(5, 30, 25);  // LocalTime.of(hour, minute, second)
        System.out.println(time);

        // Change Date
        LocalDate date = LocalDate.of(2026, 9, 27);
        System.out.println(date);
        // Increase date
        LocalDate newdate = date.plusDays(10);
        System.out.println(newdate);
        LocalDate newdate1 = date.plusWeeks(3);
        System.out.println(newdate1);
        // date.plusWeeks();
        // date.plusMonths();
        // date.plusYears();

        // Decrease date
        LocalDate newdate2 = date.minusDays(11);
        System.out.println(newdate2);

        // Compare two dates
        LocalDate date1 = LocalDate.of(2026, 7, 9);
        LocalDate date2 = LocalDate.of(2027, 8, 12);
        System.out.println(date1.isBefore(date2));
        System.out.println(date1.isAfter(date2));
        System.out.println(date1.isEqual(date2));

        // Difference between dates
        Period p = Period.between(date1, date2);
        System.out.println(p.getDays());
        System.out.println(p.getMonths());
        System.out.println(p.toTotalMonths());
        System.out.println(p.getYears());
        System.out.println(p.getYears());
        System.out.println();
        // Difference between time
        LocalTime T1 = LocalTime.of(10, 26, 35);
        LocalTime T2 = LocalTime.of(12, 58, 26);
        Duration D = Duration.between(T1, T2);
        System.out.println(D.toHours());
        System.out.println(D.toMinutes());
        System.out.println(D.toSeconds());
    }
}

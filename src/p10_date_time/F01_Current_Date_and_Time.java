package p10_date_time;
//import java.time.*;  //--> for all date and time classes;
import java.time.LocalDate;  // Represents a date (year, month, day (yyyy-MM-dd))
import java.time.LocalTime;  // Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
import java.time.LocalDateTime;  // Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
public class F01_Current_Date_and_Time {
    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        System.out.println(today);  // Display the current date

        LocalTime time = LocalTime.now();
        System.out.println(time);  // Display the current time

        LocalDateTime timedate = LocalDateTime.now();
        System.out.println(timedate);  // Display the current date and time
    }
}

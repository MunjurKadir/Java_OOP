package p10_date_time;
import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class
public class F03_Date_Time_Formatter {
    public static void main (String[] args){
        LocalDateTime DT = LocalDateTime.now();
        System.out.println("Before Formatting: " + DT);

        DateTimeFormatter formatDT = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); // Create a formatter with a specific date and time pattern
        String Formatted = DT.format(formatDT);  // Format the date and time using the specified pattern
        System.out.println("After Formatting: " + Formatted);
    }
}
// other formats type
// yyyy-MM-dd --> "1988-09-29"
// dd/MM/yyyy --> "29/09/1988"
// dd-MMM-yyyy --> "29-Sep-1988"
// E, MMM dd yyyy --> "Thu, Sep 29 1988"

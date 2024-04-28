import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class PeriodicRemainder{
    public static void main(String[] args){
        try{
            Scanner Sc=new Scanner(System.in);
            System.out.print("Enter the remainder datetime in format(YYYY-MM-DDTHH:MM):");
            String input=Sc.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
            LocalDateTime reminderDateTime = LocalDateTime.parse(input, formatter);
            while (true){
            LocalDateTime nowtime=LocalDateTime.now();
            System.out.println("time now is "+nowtime);
            if (nowtime.isAfter(reminderDateTime) || nowtime.equals(reminderDateTime)) {
                System.out.println("Time is over,Go to the work!");
                break;
            }
        }}
        catch (Exception e){
            System.out.println(" INPUT ERROR");
        }
    }
}
/*7.Periodic Reminder: Simulate a basic reminder system. Read a date and time for a reminder along with a message from the user.
 Schedule a task (using libraries like java.util.Timer or a third-party library)
 to display the reminder message when the specified date and time arrives. */
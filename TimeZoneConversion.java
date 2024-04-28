import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class TimeZoneConversion{
    public static void main(String[] args){
        try{
            Scanner Sc=new Scanner(System.in);
            System.out.print("Enter the datetime in format(YYYY-MM-DDTHH:MM):");
            String datetime=Sc.nextLine();
            System.out.print("Enter the timezone of above time in format(e.g., America/New_York or Australia/Sydney):");
            String givenzone=Sc.nextLine();
            System.out.print("Enter the time zone in format(e.g.,America/Los_Angeles or Asia/Tokyo) in which you want to convert your entered time:");
            String targetzone=Sc.nextLine();
            LocalDateTime input=LocalDateTime.parse(datetime);
            ZoneId givenid=ZoneId.of(givenzone);
            ZoneId targetid=ZoneId.of(targetzone);
            ZonedDateTime zonedDateTime=ZonedDateTime.of(input,givenid);
            System.out.println("Datetime in "+givenzone+" timezone is "+zonedDateTime);
            ZonedDateTime targetedzonedDateTime=zonedDateTime.withZoneSameInstant(targetid);
            System.out.println("Datetime in "+targetzone+" timezone is "+targetedzonedDateTime);
        }
        catch(Exception e){
            System.out.println("You made a mistake during enteing");
        }
    }
}
/*Write a program that reads a date and time (e.g., LocalDateTime) along with the source time zone (e.g., "UTC") from the user. 
Convert the date and time to a specific target time zone (e.g., "America/Los_Angeles") using the ZonedDateTime class. */
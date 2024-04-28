import java.util.Scanner;
import java.time.LocalTime;
import java.time.Duration;
import java.time.format.DateTimeParseException;
public class Duration_between_Events{
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the starting date of the event:");
        String start=Sc.nextLine();
        System.out.print("Enter the end time of the event:");
        String end=Sc.nextLine();
        LocalTime starting=LocalTime.parse(start);
        LocalTime ending=LocalTime.parse(end);
        Duration duration=Duration.between(ending,starting);
        System.out.println("The duration between start and ending is"+duration);
    }
    
        } 

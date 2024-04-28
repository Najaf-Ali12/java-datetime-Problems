// Write a program that reads a time in 24-hour format (e.g., "14:23") 
//from the user and converts it to 12-hour format (e.g., "2:23 PM").
import java.time.LocalTime;
import java.time.Duration;
import java.util.Scanner;
public class timeConversion{
public static void main(String[] args){
    try{
    LocalTime obj= LocalTime.now();
    Scanner obj2=new Scanner(System.in);
    System.out.print("enter the time(HH:MM:SS):");
    String time=obj2.nextLine();
    LocalTime timeinput=LocalTime.parse(time);
    LocalTime time2=LocalTime.of(12,00,00);
    if (timeinput.compareTo(time2)<=0){
            System.out.println("The time in 12hour format is "+timeinput);
    }
    else{
        Duration difference=Duration.between(timeinput,time2);
        System.out.println("The time in 12hour format is "+difference);
    }
}
    catch(Exception e){
        System.out.println("enter the correct time and also in the format given!");
    }
}
}

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
public class DateAndTimeValidation{
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        LocalDate date = null;
        LocalTime time = null;
        try{
        System.out.print("Enter the date in format(YYYY-MM-DD):");
        String inputdate=Sc.nextLine();
        date=LocalDate.parse(inputdate);
        System.out.println("Congratulations, You inputted date  is in correct format");
    }
    catch (Exception e){
        System.out.println("The format of your  inputted date is not right:");
    }
    try{System.out.print("Enter the time in the format(HH:MM:SS):");
    String inputtime=Sc.nextLine();
    time=LocalTime.parse(inputtime);
    System.out.println("Congratulations,You entered the time in correct format:");
    }
    catch (Exception e){
        System.out.println("The format of your inputted time is not correct:");
    }
    LocalDate today=LocalDate.now();
    LocalTime thistime=LocalTime.now();
    if (!time.isAfter(thistime)){
        System.out.println("Please enter the time of future:");
    }
    else if (!date.isAfter(today)){
        System.out.println("Please enter the date of future:");
    }    
    else if (!time.isAfter(thistime)){
        if (!date.isAfter(today)){
            System.out.println("enter both date and time of the future:");
        }
    }
}
}
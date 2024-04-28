import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.math.*;
public class dateDifference{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first date in format(YYYY-MM-DD):");
        String first=sc.nextLine();
        System.out.print("Enter the second date in format(YYYY-MM-DD):");
        String second=sc.nextLine();
        LocalDate firstdate=LocalDate.parse(first);
        LocalDate seconddate=LocalDate.parse(second);
            Period datedifference=Period.between(firstdate,seconddate);
            int months=datedifference.getMonths();
            int years=datedifference.getYears();
            int days=datedifference.getDays();
            System.out.println("The difference is "+Math.abs(((months*30)+(years*365)+days))+" days");
        
    }
}
/*: Write a program that takes two dates as input from the user (e.g., using Scanner)
 and calculates the difference between them in days. */
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class BirthDayCalculator{
    public static void main(String[] args){
        LocalDate obj=LocalDate.now();
        System.out.println(obj);
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your date of birth(YYYY-MM-DD):");
        String birth=sc.nextLine();
        LocalDate date_of_birth=LocalDate.parse(birth);
        Period difference=Period.between(obj,date_of_birth);
        System.out.println(difference);
        }
}
//
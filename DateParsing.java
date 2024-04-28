import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
public class DateParsing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date in format (YYYY-MM-DD): ");
        String dateInput = sc.nextLine();
        
        try {
            LocalDate latest = LocalDate.parse(dateInput);
            System.out.println("Input date: " + latest);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please enter the date in format YYYY-MM-DD.");
        } 
    }
}
/*DateParsing:Write a program that reads a date string in a specific format (e.g., "yyyy-MM-dd")
from the user and parses it into a LocalDate object using the LocalDate.parse() method.
Handle potential parsing exceptions gracefully. */
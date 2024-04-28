import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HolidayCalendar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        String yearString = scanner.nextLine();
        
        try {
            int year = Integer.parseInt(yearString);
            List
            <String> holidays = getHolidays(year);
            System.out.println("Holidays in " + year + ":");
            for (String holiday : holidays) {
                System.out.println(holiday);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid year.");
        }
    }

    public static List<String> getHolidays(int year) {
        List<String> holidays = new ArrayList<>();
        // Add your logic to determine holidays here
        // For demonstration, let's add some example holidays
        holidays.add("New Year's Day: " + LocalDate.of(year, 1, 1));
        if (year>1947){
            
            holidays.add("Independence Day: " + LocalDate.of(year, 8, 14));
            holidays.add("Pakistan Day: "+ LocalDate.of(year,3,23));
            holidays.add("Labour's Day: "+LocalDate.of(year,5,1));
            holidays.add("Quaed-e-Azam's Day: "+LocalDate.of(year,12,25));  
            holidays.add("Defence Day: "+LocalDate.of(year,9,6));
        }
        
            
        // Add more holidays as needed
        return holidays;
    }
}

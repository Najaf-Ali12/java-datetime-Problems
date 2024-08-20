import java.time.LocalDate;      //LocalDate class is used to get date
import java.time.LocalTime;     //LocalTime class is used to get Time
import java.time.LocalDateTime; //LocalDateTime class is used to get Date and Time Together
import java.time.format.DateTimeFormatter;    //here DateTimeFormatter is a class inside the format class
public class DateTimePractice{
    public static void main(String[] args) {
        //getting the date of today using LocalDate class of time Package
        LocalDate date_of_today=LocalDate.now();                     //LocalDate is static class(and now is static method) whose methods can be can be called without object
        System.out.println("The today's date is "+date_of_today);   //date_of_obj this is variable of LocalDate class

        //getting the time of this moment
        LocalTime time_of_now=LocalTime.now();
        System.out.println("The time of now is "+time_of_now);  //format of output is HH:MM:SS:Nanoseconds

        //getting both the date and time of this moment
        LocalDateTime time_date_of_now=LocalDateTime.now() ;
        System.out.println(time_date_of_now);                 //output format is YYYY-MM-DDTHH:MM:SS:nanoseconds

        //formatting the output of datetime according to our wish
        //Formatting the pattern of date on our wish
        DateTimeFormatter format_obj_of_date=DateTimeFormatter.ofPattern("dd-MM-Y");  //give correct pattern of date
        String formattedDate = date_of_today.format(format_obj_of_date);
        System.out.println("Date of today after formatting: "+formattedDate);
        
        //Formatting the pattern of time on our wish
        DateTimeFormatter format_obj_of_time=DateTimeFormatter.ofPattern("HH:mm");   //give correct pattern of time
        String formattedTime=time_of_now.format(format_obj_of_time);
        System.out.println("Time after formatting is: "+formattedTime);

        //Formatting the pattern of datetime on our wish
        DateTimeFormatter format_of_datetime=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime=time_date_of_now.format(format_of_datetime);
        System.out.println("Date and time after formatting: "+formattedDateTime);
    }

}
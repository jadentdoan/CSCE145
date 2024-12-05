// Written by Jaden Doan
 
import java.util.Scanner;
 
public class DateAndTimeTester 
{
 
    public void run() 
    {
        Scanner kb = new Scanner(System.in);
        boolean continueRunning = true;
 
        while (continueRunning) 
        {
            System.out.println("Enter a date and time (MM/DD hh:mm) and I will determine if it is valid");    
            String input = kb.nextLine();
 
            if (isValid(input))
            {
                System.out.println("The date and time is valid.");
            } else 
            	
            {
                System.out.println("The date and time is invalid.");
            }
 
           
            System.out.println("Would you like to quit? Type 'quit' to exit or press [ENTER] to continue:");
            String userResponse = kb.nextLine();
            if (userResponse.equalsIgnoreCase("quit")) {
                continueRunning = false;
            }
        }
        
        kb.close();
        
    }
 
    public boolean isValid(String dateTime) 
    {
        String[] parts = dateTime.split(" ");
        if (parts.length != 2) return false; 
 
        String datePart = parts[0];
        String timePart = parts[1];
 
        return isValidDate(datePart) && isValidTime(timePart);
    }
 
    public boolean isValidDate(String date) 
    {
        String[] dateParts = date.split("/");
        if (dateParts.length != 2) return false;
        
        int month = getMonth(date);
        int day = getDay(date);
 
        if (month < 1 || month > 12) return false;
        if (day < 1 || day > 28) return false; 
 
       
        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) return false;
        if (month == 2 && day > 28) return false;
 
        return true;
    }
 
    public boolean isValidTime(String time) 
    {
        String[] timeParts = time.split(":");
        if (timeParts.length != 2) return false; 
 
        int hour = getHour(time);
        int minute = getMinute(time);
 
        return (hour >= 1 && hour <= 12) && (minute >= 0 && minute < 60);
    }
 
    public int getMonth(String date)
    {
        String[] dateParts = date.split("/");
        return Integer.parseInt(dateParts[0]);
    }
 
    public int getDay(String date) 
    {
        String[] dateParts = date.split("/");
        return Integer.parseInt(dateParts[1]);
    }
 
    public int getHour(String time) 
    {
        String[] timeParts = time.split(":");
        return Integer.parseInt(timeParts[0]);
    }
 
    public int getMinute(String time) 
    {
        String[] timeParts = time.split(":");
        return Integer.parseInt(timeParts[1]);
    }
    
		
	}
 
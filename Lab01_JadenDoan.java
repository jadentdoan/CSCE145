import java.util.Scanner;
public class Lab01_JadenDoan 
{
 
	public static void main(String[] args) 
	{
		
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your Zodiac sign? Enter your birthday -- Month followed by Day as numbers");
		int m = kb.nextInt();
		int d = kb.nextInt();
		
		if(m >= 1 && m <= 12) 
		{
			if((m == 4 || m == 6 || m == 9 || m == 11) && (d >= 1 && d <= 30)) 
			{
				// Valid days for April, June, September, November
			}
			else if(m == 2 && d >= 1 && d <= 29) 
			{
				// Valid days for February
			}
			else if((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && (d >= 1 && d <= 31))  
			{
				// Valid days for January, March, May, July, August, October, December
			}
			else 
			{
				System.out.println("Invalid day for the given month.");
				return; // Exit the program if the date is invalid
			}
		}
		else 
		{
			System.out.println("Invalid month.");
			return; // Exit the program if the month is invalid
		}
		
		if( (m == 3 && d >= 21) || (m == 4 && d <= 19 ))
		{
			System.out.println("You're an Aries!");
		}
		if( (m == 4 && d >= 20) || (m == 5 && d <= 20 ))
		{
			System.out.println("You're a Taurus!");
		}
		if( (m == 5 && d >= 21) || (m == 6 && d <= 20 ))
		{
			System.out.println("You're a Gemini!");
		}
		if( (m == 6 && d >= 21) || (m == 7 && d <= 22 ))
		{
			System.out.println("You're a Cancer!");
		}
		if( (m == 7 && d >= 23) || (m == 8 && d <= 22 ))
		{
			System.out.println("You're a Leo!");
		}
		if( (m == 8 && d >= 23) || (m == 9 && d <= 22 ))
		{
			System.out.println("You're a Virgo!");
		}
		if( (m == 9 && d >= 23) || (m == 10 && d <= 22 ))
		{
			System.out.println("You're a Libra!");
		}
		if( (m == 10 && d >= 23) || (m == 11 && d <= 21 ))
		{
			System.out.println("You're a Scorpio!");
		}
		if( (m == 11 && d >= 22) || (m == 12 && d <= 21 ))
		{
			System.out.println("You're a Sagittarius!");
		}
		if( (m == 12 && d >= 22) || (m == 1 && d <= 19 ))
		{
			System.out.println("You're a Capricorn!");
		}
		if( (m == 1 && d >= 20) || (m == 2 && d <= 18 ))
		{
			System.out.println("You're an Aquarius!");
		}
		if( (m == 2 && d >= 19) || (m == 3 && d <= 20 ))
		{
			System.out.println("You're a Pisces!");
		}
	}
}
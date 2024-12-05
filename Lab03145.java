//Written by Jaden Doan

import java.util.Scanner;
public class Lab03145 
{

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to the Below Average Temperature Tester.");
		
		System.out.print("Please enter the temperature for day 1.");
		int day1 = kb.nextInt();
		System.out.print("Please enter the temperature for day 2.");
		int day2 = kb.nextInt();
		System.out.print("Please enter the temperature for day 3.");
		int day3 = kb.nextInt();
		System.out.print("Please enter the temperature for day 4.");
		int day4 = kb.nextInt();
		System.out.print("Please enter the temperature for day 5.");
		int day5 = kb.nextInt();
		System.out.print("Please enter the temperature for day 6.");
		int day6 = kb.nextInt();
		System.out.print("Please enter the temperature for day 7.");
		int day7 = kb.nextInt();
		System.out.print("Please enter the temperature for day 8.");
		int day8 = kb.nextInt();
		System.out.print("Please enter the temperature for day 9.");
		int day9 = kb.nextInt();
		System.out.print("Please enter the temperature for day 10.");
		int day10 = kb.nextInt();
		
		int array[] = {day1, day2, day3, day4, day5, day6, day7, day8, day9, day10};
		
		int sum = 0;
        for (int temp : array) 
        {
            sum += temp;
        }
        double average = sum / 10.0;
        
        System.out.println("The average temperature was " + average);
        System.out.println("The days that were below average were:");
        for (int i = 0; i < array.length; i++) 
        {
            if (array[i] < average) 
            {
                System.out.println("Day " + (i + 1) + ": " + array[i]);
            }
        }
		
		
	}

}

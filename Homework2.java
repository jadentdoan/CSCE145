//Written by Jaden Doan

import java.util.Scanner;

public class Homework2 
{

	public static void main(String[] args) 
	{
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a 4-bit binary number");
		String binary1 = kb.next();
		System.out.println("Enter another 4-bit binary number");
		String binary2 = kb.next();
		
		int decimal1 = binaryToDecimal(binary1);
        int decimal2 = binaryToDecimal(binary2);
	
        int sum = decimal1 + decimal2;
 
        System.out.println("The first number is " + decimal1);
        System.out.println("The second number is " +decimal2);
        System.out.println("Added together is " + sum);
        
        kb.close();
 
    }
 
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();
 
        for (int i = 0; i < length; i++) {
            int bit = binary.charAt(length - 1 - i) - '0';
            decimal += bit * Math.pow(2, i);
        }
 
        return decimal;
    
	}

}

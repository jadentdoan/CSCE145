//Written by Jaden Doan

import java.util.Scanner;
public class Lab145_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to Triangle Maker! Enter the size of the triangle.");
		int size = kb.nextInt();
 
		for (int x = 1; x <= size; x++) {
			for (int y = size; y > x; y--) {
				System.out.print("");
			}
			for (int z = 1; z <= x; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
 
		for (int p = size - 1; p >= 1; p--) {
			for (int j = size; j > p; j--) {
				System.out.print("");
			}
			for (int k = 1; k <= p; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}

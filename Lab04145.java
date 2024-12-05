//Written by Jaden Doan

import java.util.Scanner;

public class Lab04145 
{

	public static void main(String[] args) 
	{
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to the matrix adder program!");
		System.out.println("Please enter the legnth and width of the first matrix.");
	        int length = kb.nextInt();
	        int width = kb.nextInt();
	        int[][] matrix1 = new int[length][width];
		
	        System.out.println("Please enter index 0:");
	        matrix1[0][0] = kb.nextInt();
	        System.out.println("Please enter index 0:");
	        matrix1[0][1] = kb.nextInt();
	        System.out.println("Please enter index 1:");
	        matrix1[1][0] = kb.nextInt();
	        System.out.println("Please enter index 1:");
	        matrix1[1][1] = kb.nextInt();
	        
	    System.out.println("Please enter the length and width of the second matrix.");
	    int[][] matrix2 = new int[length][width];
	    	 System.out.println("Please enter index 0:");
		        matrix2[0][0] = kb.nextInt();
		        System.out.println("Please enter index 0:");
		        matrix2[0][1] = kb.nextInt();
		        System.out.println("Please enter index 1:");
		        matrix2[1][0] = kb.nextInt();
		        System.out.println("Please enter index 1:");
		        matrix2[1][1] = kb.nextInt();
	   
		        printMatrix(matrix1);
		        System.out.println(" + ");
		        printMatrix(matrix2);

		        int[][] sumMatrix = addMatrices(matrix1, matrix2);
		        System.out.println(" = ");
		        printMatrix(sumMatrix);
		        
		        
		        
		        
		       
	}
	
	public static void printMatrix(int[][] matrix) 
	{
    	for (int[] row : matrix) 
    	{
    		for (int element : row) 
    		{
    			System.out.print(element + " ");
    		}
    		System.out.println();
    	}
    }
	
	public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) 
	{
        int length = matrix1.length;
        int width = matrix1[0].length;
        int[][] sumMatrix = new int[length][width];

        for (int i = 0; i < length; i++) 
        {
            for (int j = 0; j < width; j++) 
            {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sumMatrix;
    }
	
}

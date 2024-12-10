//Written by Jaden Doan

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double[][] rectangles = null;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\nMenu:");
            System.out.println("1. Enter Rectangle Data");
            System.out.println("2. Sort and display Rectangles' areas (Smallest to Largest)");
            System.out.println("3. Sort and display Rectangles' areas (Largest to Smallest)");
            System.out.println("4. Display Average Area");
            System.out.println("5. Display Minimum Area");
            System.out.println("6. Display Maximum Area");
            System.out.println("7. Quit");
            System.out.print("Choose an option: ");
            int choice = kb.nextInt();

            switch (choice) 
            {
                case 1:
                    rectangles = enterRectangleData(kb);
                    break;
                case 2:
                    if (rectangles == null || rectangles.length == 0) 
                    {
                        System.out.println("No collection created. Cannot sort an empty collection.");
                    } else 
                    {
                        sortRectangles(rectangles, true);
                        displayAreas(rectangles);
                    }
                    break;
                case 3:
                    if (rectangles == null || rectangles.length == 0) 
                    {
                        System.out.println("No collection created. Cannot sort an empty collection.");
                    } else 
                    {
                        sortRectangles(rectangles, false);
                        displayAreas(rectangles);
                    }
                    break;
                case 4:
                    if (rectangles == null || rectangles.length == 0) 
                    {
                        System.out.println("No collection created. Cannot display average area.");
                    } else 
                    {
                        System.out.println("Average Area: " + calculateAverageArea(rectangles));
                    }
                    break;
                case 5:
                    if (rectangles == null || rectangles.length == 0) 
                    {
                        System.out.println("No collection created. Cannot find minimum area.");
                    } else 
                    {
                        System.out.println("Minimum Area: " + findMinimumArea(rectangles));
                    }
                    break;
                case 6:
                    if (rectangles == null || rectangles.length == 0) 
                    {
                        System.out.println("No collection created. Cannot find maximum area.");
                    } else 
                    {
                        System.out.println("Maximum Area: " + findMaximumArea(rectangles));
                    }
                    break;
                case 7:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
        kb.close();
    }

    public static double[][] enterRectangleData(Scanner scanner) 
    {
        System.out.print("Enter the size of the collection: ");
        int size;
        while (true) 
        {
            size = scanner.nextInt();
            if (size > 0) 
            {
                break;
            } else 
            {
                System.out.print("Invalid size. Please enter a positive number: ");
            }
        }

        double[][] rectangles = new double[size][2];
        for (int i = 0; i < size; i++) 
        {
            System.out.print("Enter length for rectangle " + (i + 1) + ": ");
            rectangles[i][0] = scanner.nextDouble();
            System.out.print("Enter width for rectangle " + (i + 1) + ": ");
            rectangles[i][1] = scanner.nextDouble();
        }
        return rectangles;
    }

    public static void sortRectangles(double[][] rectangles, boolean ascending) 
    {
        for (int i = 0; i < rectangles.length - 1; i++) 
        {
            for (int j = 0; j < rectangles.length - i - 1; j++) 
            {
                double area1 = rectangles[j][0] * rectangles[j][1];
                double area2 = rectangles[j + 1][0] * rectangles[j + 1][1];
                if ((ascending && area1 > area2) || (!ascending && area1 < area2)) 
                {
                    double[] temp = rectangles[j];
                    rectangles[j] = rectangles[j + 1];
                    rectangles[j + 1] = temp;
                }
            }
        }
    }

    public static void displayAreas(double[][] rectangles) 
    {
        System.out.println("Areas of Rectangles:");
        for (double[] rectangle : rectangles) 
        {
            double area = rectangle[0] * rectangle[1];
            System.out.println(area);
        }
    }

    public static double calculateAverageArea(double[][] rectangles) 
    {
        double totalArea = 0;
        for (double[] rectangle : rectangles) {
            totalArea += rectangle[0] * rectangle[1];
        }
        return totalArea / rectangles.length;
    }

    public static double findMinimumArea(double[][] rectangles) 
    {
        double minArea = rectangles[0][0] * rectangles[0][1];
        for (double[] rectangle : rectangles) 
        {
            double area = rectangle[0] * rectangle[1];
            if (area < minArea) 
            {
                minArea = area;
            }
        }
        return minArea;
    }

    public static double findMaximumArea(double[][] rectangles) 
    {
        double maxArea = rectangles[0][0] * rectangles[0][1];
        for (double[] rectangle : rectangles) 
        {
            double area = rectangle[0] * rectangle[1];
            if (area > maxArea) 
            {
                maxArea = area;
            }
        }
        return maxArea;
    }
}

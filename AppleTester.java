// Written by Jaden Doan

public class AppleTester {
    public static void main(String[] args) {
        System.out.println("Welcome to the apple tester\n");

        // Creating a default apple
        Apple defaultApple = new Apple();
        System.out.println("Creating a default apple");
        System.out.println("Printing the default apple's value");
        System.out.println(defaultApple.toString() + "\n");

        // Creating another apple with valid values
        Apple validApple = new Apple("Granny Smith", 0.75, 0.99);
        System.out.println("Creating another apple");
        System.out.println("Setting the new apple's values to the following, valid values: Granny Smith, 0.75, 0.99");
        System.out.println("Printing the new apple's values");
        System.out.println(validApple.toString() + "\n");

        // Creating another apple with invalid values
        Apple invalidApple = new Apple("iPad", 2.5, -200);
        System.out.println("Creating another default apple");
        System.out.println("Setting the new apple's values to the following, invalid values: iPad, 2.5, -200");
        System.out.println("Printing the newest apple's values which should not have changed from the default values");
        System.out.println(invalidApple.toString() + "\n");

        // Checking the equality of the first and last apple
        System.out.println("Checking if the first and last apple have the same values.");
        System.out.println(defaultApple.equals(invalidApple));
    }
}

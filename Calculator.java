import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number;
        long sum = 0;

        System.out.println("Please enter any positive number (N):");
        
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();  
            if (number > 0) {
                for (int i = 1; i <= number; i++) {
                    sum += i;
                }
                System.out.println("The sum of all numbers from 1 to " + number + " equals: " + sum); 
            } else {
                System.out.println("Error: You entered a negative number.");
            }
        } else {
            System.out.println("Error: Incorrect input. Please enter an integer.");
        }
        
        scanner.close();
    }
}
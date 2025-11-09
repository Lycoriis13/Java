import java.util.Scanner;

public class Multiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exitCode = 0; 
        
        do {
            double num1 = 0;
            double num2 = 0;

            System.out.println("------------------------------------");
            System.out.println("Enter the first number:");
            
            if (scanner.hasNextDouble()) {
                num1 = scanner.nextDouble();
            } else {
                System.out.println("Input error. Please enter a number.");
                scanner.nextLine();
                continue;
            }

            System.out.println("Enter the second number:");
            if (scanner.hasNextDouble()) {
                num2 = scanner.nextDouble();
            } else {
                System.out.println("Input error. Please enter a number.");
                scanner.nextLine();
                continue;
            }

            double result = num1 * num2;
            System.out.printf("Result of multiplication: %.2f * %.2f = %.2f\n", num1, num2, result);
            
            System.out.println("\nDo you want to finish? (Enter 1 - YES, any other number - NO):");
            
            if (scanner.hasNextInt()) {
                exitCode = scanner.nextInt();
            } else {
                System.out.println("Incorrect input. Continuing work...");
                exitCode = 0;
                scanner.nextLine(); 
            }

        } while (exitCode != 1);

        System.out.println("------------------------------------");
        scanner.close();
    }
}
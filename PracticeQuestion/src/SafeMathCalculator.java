// Practice 7: Safe Math Calculator
//Pranish KHANAL

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeMathCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {       //Error handling
            System.out.print("Enter first integer: ");
            int a = scanner.nextInt();

            System.out.print("Enter second integer: ");
            int b = scanner.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter integers only.");
        } finally {
            scanner.close();
        }
    }
}
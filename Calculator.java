import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("🔢 Simple Calculator");

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.print("Choose an operation (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double result = 0;
        boolean valid = true;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("❌ Cannot divide by zero!");
                valid = false;
            }
        } else {
            System.out.println("❌ Invalid operator");
            valid = false;
        }

        if (valid) {
            System.out.println("✅ Result: " + result);
        }

        input.close();
    }
}
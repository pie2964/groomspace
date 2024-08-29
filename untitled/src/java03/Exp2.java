package java03;

import java.util.Scanner;

public class Exp2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    // 나눗셈 시 0으로 나누는 경우 예외 처리
                    if (num2 == 0) {
                        throw new ArithmeticException("Error: Cannot divide by zero.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Error: Invalid operator.");
            }

            System.out.println("The result is: " + result);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
        } finally {
            scanner.close();
        }
    }
}

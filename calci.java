import java.util.Scanner;

public class calci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("first number:");
        double num1 = scanner.nextDouble();

        System.out.println("second number:");
        double num2 = scanner.nextDouble();

        System.out.println("operation (+, -, *, /, sqrt):");
        String operation = scanner.next();

        double result = 0;

        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            case "sqrt":
                if (num1 >= 0) {
                    result = Math.sqrt(num1);
                } else {
                    System.out.println("Cannot calculate square root of a negative number.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }

        System.out.println("Answer" + result);

        scanner.close();
    }
}


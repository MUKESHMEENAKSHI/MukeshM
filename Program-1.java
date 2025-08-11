import java.util.Scanner;

class Calculator {
    double a, b;
    String operation;

    void setValues(double x, double y, String op) {
        a = x;
        b = y;
        operation = op.toLowerCase();
    }

    void performOperation() {
        switch (operation) {
            case "add":
                System.out.println("Result: " + (a + b));
                break;
            case "subtract":
                System.out.println("Result: " + (a - b));
                break;
            case "multiply":
                System.out.println("Result: " + (a * b));
                break;
            case "divide":
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid operation. Use add, subtract, multiply, or divide.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = sc.next();

        
        Calculator calc = new Calculator();
        calc.setValues(a, b, operation);
        calc.performOperation();
    }
}

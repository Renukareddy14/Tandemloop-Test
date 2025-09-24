import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = sc.next();

        double result = 0;

        switch (operation) {
            case "add":
                result = a + b;
                System.out.println("Result: " + result);
                break;

            case "sub":
                result = a - b;
                System.out.println("Result: " + result);
                break;

            case "mul":
                result = a * b;
                System.out.println("Result: " + result);
                break;

            case "div":
                    result = a / b;
                    System.out.println("Result: " + result);
                              break;

            default:
                System.out.println("Invalid operation");
        }
    }
}

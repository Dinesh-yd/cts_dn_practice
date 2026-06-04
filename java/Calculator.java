import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.print("Choose operation (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        double result;
        switch (op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': result = b == 0 ? Double.NaN : a / b; break;
            default: System.out.println("Invalid operation"); return;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}

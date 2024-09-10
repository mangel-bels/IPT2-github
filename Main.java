import java.util.Scanner;

public class Main {
    public int add (int a, int b){
        return a + b;
    }
    public int subtract (int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main calculator = new Main();
    
        try {
            System.out.println("Enter the first number: ");
            int num1 = scanner.nextInt();
    
            System.out.println("Enter the second number: ");
            int num2 = scanner.nextInt();
    
            System.out.println("Enter the operation (+, -, *, /, %): ");
            String operation = scanner.next();
    
            switch (operation) {
                case "+":
                    System.out.println("Result: " + calculator.add(num1, num2));
                    break;
                case "-":
                    System.out.println("Result: " + calculator.subtract(num1, num2));
                    break;
                case "*":
                    System.out.println("Result: " + calculator.multiply(num1, num2));
                    break;
                case "/":
                    try {
                        System.out.println("Result: " + calculator.divide(num1,num2));
                    } catch (ArithmeticException e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                    break;
                case "%":
                    System.out.println("Result: " + calculator.modulus(num1, num2));
                    break;
                default:
                    System.err.println("Invalid operation. Please enter one of the following: + - * / %");
                    break;
            }
        }
        catch (Exception e) {
            System.err.println("Invalid input. Please enter valid integers. ");
        }
        finally {
            scanner.close();
        }
    }
}
    
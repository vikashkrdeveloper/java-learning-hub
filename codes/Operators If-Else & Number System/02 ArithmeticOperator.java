import java.util.Scanner;

class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int a = input.nextInt();
        System.out.print("Enter your second number: ");
        int b = input.nextInt();

        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int modulus = a % b;

        System.out.println("Addition: ==> (" + addition + ")");
        System.out.println("Subtraction: ==> (" + subtraction + ")");
        System.out.println("Multiplication: ==> (" + multiplication + ")");
        System.out.println("Division: ==> (" + division + ")");
        System.out.println("Modulus: ==> (" + modulus + ")");
    }
}

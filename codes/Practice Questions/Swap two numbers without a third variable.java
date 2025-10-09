import java.util.Scanner;

class SwapTwoVariableWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        System.out.println("Before swapping: ");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);

        // Swapping without a third variable
        firstNumber = firstNumber + secondNumber; // Step 1: Add both numbers
        secondNumber = firstNumber - secondNumber; // Step 2: Subtract new secondNumber from the sum to get the first number
        firstNumber = firstNumber - secondNumber; // Step 3: Subtract new firstNumber from the sum to get the second number

        System.out.println("After swapping: ");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
    }
}

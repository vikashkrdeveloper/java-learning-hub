import java.util.Scanner;

class SwapTwoNumber {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);

        // Swapping back without using a temporary variable
        a = a + b; // a now becomes 15
        b = a - b; // b becomes 5
        a = a - b; // a becomes 10
        System.out.println("After swapping back: a = " + a + ", b = " + b);

        // Assigning values using Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = input.nextInt();
        System.out.print("Enter second number: ");
        b = input.nextInt();
        System.out.println("You entered: a = " + a + ", b = " + b);

        //  Swapping number
        a = a + b; // a now becomes sum of a and b
        b = a - b; // b becomes original a
        a = a - b; // a becomes original b
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}

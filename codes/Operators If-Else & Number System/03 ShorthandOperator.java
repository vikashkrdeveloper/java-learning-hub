import java.util.Scanner;

class ShorthandOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int a = input.nextInt();
        System.out.print("Enter your second number: ");
        int b = input.nextInt();
        a += b; // a = a + b
        System.out.println("After a += b, a ==> (" + a + ")");
        a -= b; // a = a - b
        System.out.println("After a -= b, a ==> (" + a + ")");
        a *= b; // a = a * b
        System.out.println("After a *= b, a ==> (" + a + ")");
        a /= b; // a = a / b
        System.out.println("After a /= b, a ==> (" + a + ")");
        a %= b; // a = a % b
        System.out.println("After a %= b, a ==> (" + a + ")");
    }
}
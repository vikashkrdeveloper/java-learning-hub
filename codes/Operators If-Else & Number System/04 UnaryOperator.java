import java.util.Scanner;

class UnaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = input.nextInt();

        a++; // Post-increment
        System.out.println("After post-increment (a++), a ==> (" + a + ")");
        ++a; // Pre-increment
        System.out.println("After pre-increment (++a), a ==> (" + a + ")");
        a--; // Post-decrement
        System.out.println("After post-decrement (a--), a ==> (" + a + ")");
        --a; // Pre-decrement
        System.out.println("After pre-decrement (--a), a ==> (" + a + ")");

        // Difference between Post & Pre Increment/Decrement
        int postIncrement = a++; // Post-increment (This will assign the current value of a, then increment a)
        System.out.println("\n\nPost-increment (b = a++) ==> (b: " + postIncrement + ", a: " + a + ")");
        a--; // Decrementing a back to original for clarity
        int preIncrement = ++a; // Pre-increment (This will increment a first, then assign the new value to preIncrement)
        System.out.println("Pre-increment (c = ++a) ==> (c: " + preIncrement + ", a: " + a + ")");
        a--; // Decrementing a back to original for clarity
        int postDecrement = a--; // Post-decrement (This will assign the current value of a, then decrement a)
        System.out.println("Post-decrement (d = a--) ==> (d: " + postDecrement + ", a: " + a + ")");
        a++; // Incrementing a back to original for clarity
        int preDecrement = --a; // Pre-decrement (This will decrement a first, then assign the new value to preDecrement)
        System.out.println("Pre-decrement (e = --a) ==> (e: " + preDecrement + ", a: " + a + ")");

        int unaryPlus = +a; // Unary plus (This is redundant but included for demonstration | it doesn't change the value)
        System.out.println("\n\nUnary plus (+a) ==> (" + unaryPlus + ")"); // ==>
        int unaryMinus = -a; // Unary minus (This changes the sign of the value)
        System.out.println("Unary minus (-a) ==> (" + unaryMinus + ")"); // ==>

    }
}

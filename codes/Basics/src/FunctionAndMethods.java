public class FunctionAndMethods {
    // A method that takes two integers as parameters and returns their sum
    public static int add(int a, int b) {
        return a + b;
    }

    // A method that takes a string as a parameter and prints it in uppercase
    public static void printUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }

    public static void main(String[] args) {
        // Calling the add method and storing the result
        int sum = add(5, 10);
        System.out.println("Sum: " + sum);

        // Calling the printUpperCase method
        printUpperCase("hello, world!");
    }

    // Difference between function and method in Java:
    // In Java, a method is a block of code that is associated with an object or class.
    // A function is a more general term that refers to a block of code that performs a specific task and can be called independently.
    // In Java, all functions are methods, but not all methods are functions.

    // Difference between static and non-static methods:
    // Static methods belong to the class and can be called without creating an instance of the class.
    // Non-static methods belong to an instance of the class and require an object of the class to be created before they can be called.
}

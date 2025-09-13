public class DataTypes {
    public static void main(String[] args) {
        // Primitive Data Types
        int myInt = 100;
        double myDouble = 99.99;
        char myChar = 'A';
        boolean myBoolean = true;

        // Non-Primitive Data Types
        String myString = "Hello, Java!";
        int[] myArray = {1, 2, 3, 4, 5};

        // Printing Primitive Data Types
        System.out.println("Integer: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBoolean);

        // Printing Non-Primitive Data Types
        System.out.println("String: " + myString);
        System.out.print("Array: ");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}

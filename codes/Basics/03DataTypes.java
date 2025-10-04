class DataTypes {
    public static void main(String[] args) {
        // Primitive Data Types
        byte myByte = 1;
        int myInt = 100;
        short myShort = 10;
        long myLong = 1000L;
        float myFloat = 10.5f;
        double myDouble = 99.99;
        char myChar = 'A';
        boolean myBoolean = true;

        // Non-Primitive Data Types
        String myString = "Hello, Java!";
        int[] myArray = {1, 2, 3, 4, 5};
        Object myObject = new Object();


        // Printing Primitive Data Types
        System.out.println("Byte: " + myByte);
        System.out.println("Short: " + myShort);
        System.out.println("Long: " + myLong);
        System.out.println("Float: " + myFloat);
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
        System.out.println("\nObject: " + myObject.toString());
    }
}

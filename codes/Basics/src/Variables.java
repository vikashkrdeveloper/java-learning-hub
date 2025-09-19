public class Variables {
    public static void main(String[] args) {
        // Variable declaration and initialization
        int myNumber = 10;
        String myString = "Hello, World!";
        double myDouble = 5.99;
        boolean myBoolean = true;

        // Printing variables
        System.out.println("Integer: ==> " + myNumber);
        System.out.println("String: ==> " + myString);
        System.out.println("Double: ==> " + myDouble);
        System.out.println("Boolean: ==> " + myBoolean);

        // Changing variable values
        myNumber = 20;
        myString = "Goodbye, World!";
        myDouble = 10.99;
        myBoolean = false;

        // Printing updated variables
        System.out.println("Updated Integer: ==> " + myNumber);
        System.out.println("Updated String: ==> " + myString);
        System.out.println("Updated Double: " + myDouble);
        System.out.println("Updated Boolean: " + myBoolean);
    }
}

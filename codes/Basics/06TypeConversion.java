class TypeConversion {
    public static void main(String[] args) {
        // Type Conversion
        // Type1: Implicit Type Conversion (Widening) - Automatic (Coercion)
        int intValue = 44;
        double doubleValue = intValue; // int to double
        System.out.println("Implicit Type Conversion (Widening): ==> (" + doubleValue + ")");
        long big = 45;
        float dec = 5;
        double d = 5.4f;
        System.out.println("Implicit Type Conversion (Widening) examples: ==> (" + big + "), (" + dec + "), (" + d + ")");

        // Type2: Explicit Type Conversion (Narrowing) - Manual (Casting)
        double anotherDoubleValue = 9.78;
        int anotherIntValue = (int) anotherDoubleValue; // double to int
        System.out.println("\nExplicit Type Conversion (Narrowing): ==> (" + anotherIntValue + ")");
        float eDic = (float) 5.4;
        long eBig = (long) 5.4;
        int eInt = (int) 5.4;
        System.out.println("Explicit Type Conversion (Narrowing) examples: ==> (" + eDic + "), (" + eBig + "), (" + eInt + ")");
    }
}

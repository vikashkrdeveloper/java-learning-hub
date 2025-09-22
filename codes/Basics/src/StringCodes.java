public class StringCodes {
    public static void main(String[] args) {
        String str = "Hello, World! ==> Java String Methods";

        // Get the length of the string
        int length = str.length();
        System.out.println("Length: ==> (" + length + ")");

        // Get a character at a specific index
        char charAtIndex = str.charAt(7);
        System.out.println("Character at index 7: ==> (" + charAtIndex + ")");

        // Get the Unicode code point of a character at a specific index
        int codePointAtIndex = str.codePointAt(7);
        System.out.println("Unicode code point at index 7: ==> (" + codePointAtIndex + ")");

        // Get the Unicode code point before a specific index
        int codePointBeforeIndex = str.codePointBefore(7);
        System.out.println("Unicode code point before index 7: ==> (" + codePointBeforeIndex + ")");

        // Get the Unicode code point count in a substring
        int codePointCount = str.codePointCount(0, str.length());
        System.out.println("Total Unicode code points in the string: ==> (" + codePointCount + ")");

        // Convert the string to an array of characters
        char[] charArray = str.toCharArray();
        System.out.print("Character array: ==> ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}

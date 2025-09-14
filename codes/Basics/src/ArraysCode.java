public class ArraysCode {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Get the length of the array
        int length = numbers.length;
        System.out.println("Length of the array: " + length);

        // Access elements in the array using their index
        System.out.println("Element at index 0: " + numbers[0]);
        System.out.println("Element at index 2: " + numbers[2]);

        // Modify an element in the array
        numbers[1] = 25;
        System.out.println("Modified element at index 1: " + numbers[1]);

        // Iterate through the array and print all elements
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

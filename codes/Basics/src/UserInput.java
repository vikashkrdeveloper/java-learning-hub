import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello, " + name + "! Welcome to Java programming.");

        // Enter age
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.println("You are " + age + " years old.");
    }
}

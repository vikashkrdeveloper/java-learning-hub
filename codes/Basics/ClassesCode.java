public class ClassesCode {
    // A simple class representing a Dog
    static class Dog {
        // Attributes (fields) of the Dog class
        String name;
        int age;

        // Constructor to initialize a Dog object
        Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method to make the dog bark
        void bark() {
            System.out.println(name + " says: Woof Woof! ==> ");
        }

        // Method to get the dog's age in human years
        int getAgeInHumanYears() {
            return age * 7;
        }
    }

    public static void main(String[] args) {
        // Creating an instance (object) of the Dog class
        Dog myDog = new Dog("Buddy ==> ", 3);

        // Accessing attributes and methods of the Dog object
        System.out.println("My dog's name is: " + myDog.name);
        System.out.println("My dog is " + myDog.age + " years old.");
        myDog.bark();
        System.out.println("My dog's age in human years is: " + myDog.getAgeInHumanYears());
    }
}

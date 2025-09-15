# Basics of Java Programming

Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation
dependencies as possible. It is widely used for building enterprise-scale applications, mobile applications (especially
Android apps), web applications, and more.

# Installing Java Development Kit (JDK)

To start programming in Java, you need to install the Java Development Kit (JDK) on your machine. You can download the
latest version of JDK from the official Oracle website or use an open-source alternative like OpenJDK.

# Setting Up Your Development Environment
 
You can write Java code using any text editor, but it's recommended to use an Integrated Development Environment (IDE)
like IntelliJ IDEA, Eclipse, or NetBeans for better productivity. These IDEs provide features like code completion,
debugging, and project management.

# Writing First Java Program

Here is a simple Java program that prints "Jai Shri Ram!" to the console:

```java
public class JaiShriRam {
    public static void main(String[] args) {
        System.out.println("Jai Shri Ram! || Jai Hanuman!");
    }
}
```

# Compiling and Running Java Program

To compile and run the Java program, follow these steps:

1. Save the code in a file named `JaiShriRam.java`.
2. Open a terminal or command prompt and navigate to the directory where the file is saved.
3. Compile the program using the following command:
4. ```bash
    javac JaiShriRam.java
    ```
5. This will create a file named `JaiShriRam.class` in the same directory.
6. Run the program using the following command:
7. ```bash
    java JaiShriRam
    ```
8. You should see the output:
9. ```
    Jai Shri Ram!
    ```

# Anatomy of a Class

In Java, every application must have at least one class definition that contains the `main` method. Here is a breakdown
of the components of a Java class:

```java
public class MyClass {
    // class body
    public static void main(String[] args) {
        // code to be executed
    }
}
```

- `public`: Access modifier that allows the class to be accessible from other classes.
- `class`: Keyword used to declare a class.
- `MyClass`: Name of the class (should start with an uppercase letter).
- `static`: Indicates that the method belongs to the class rather than an instance of the class.
- `void`: Indicates that the method does not return any value.
- `main`: Name of the method that serves as the entry point of the application.
- `String[] args`: Parameter that allows the program to accept command-line arguments.
- `{}`: Curly braces that define the body of the class and method.

# File Extensions

Java source files have the `.java` extension, while compiled bytecode files have the `.class` extension.

# Differences Between JDK, JRE, and JVM

- **JDK (Java Development Kit)**: A software development kit that includes tools for developing, compiling, and
  debugging Java applications. It contains the JRE and development tools like the Java compiler (`javac`).
- **JRE (Java Runtime Environment)**: A package that provides the libraries, Java Virtual Machine (JVM), and other
  components
  necessary to run Java applications. It does not include development tools.
- **JVM (Java Virtual Machine)**: An abstract machine that enables a computer to run Java programs. It interprets
  compiled Java bytecode and
  executes it on the host machine.

# Showing Output

To display output in Java, you can use the `System.out.println()` method. This method prints the specified message to
the console and
moves the cursor to a new line. For example:

```java
    System.out.println("Hello, World!");
```

# Importance of the main method

The `main` method is the entry point of any Java application. When you run a Java program, the Java Virtual Machine (
JVM) looks for the `main` method to start executing
the program. Without the `main` method, the program will not run.

```java
    public static void main(String[] args) {
    // code to be executed
}
```

# Installing IDE(IntelliJ IDEA)

To install IntelliJ IDEA, follow these steps:

1. Go to the official IntelliJ IDEA website: https://www.jetbrains.com/idea/download
2. Choose the appropriate version for your operating system (Windows, macOS, or Linux).
3. Download the installer and run it.
4. Follow the installation instructions provided by the installer.
5. Once installed, launch IntelliJ IDEA and set up a new Java project.

Thanks for reading!


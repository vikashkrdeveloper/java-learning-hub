# Syntax Of Java

Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation
dependencies as possible. Here are some of the key syntax elements of Java:

1. **Class Declaration**: Every Java application must have at least one class definition that contains the `main`
   method.
   ```java
   public class MyClass {
       // class body ==> 
   } 
   ```
2. **Main Method**: The entry point of any Java application is the `main` method.
   ```java 
   public static void main(String[] args) {
       // code to be executed ted ==> 
   }
   ``` 
3. **Variables**: Variables must be declared with a specific data type before they can be used.
   ```java
    int myNumber = 5; // integer variable
    String myString = "Hello, World! test"; // string variable
    ```
4. **Data Types**: Java has several built-in data types, including:
    - Primitive types: `int`, `byte`, `short`, `long`, `float
    - , `double`, `char`, `boolean`
    - Non-primitive types: `String`, `Arrays`, `Classes`, etc.
5. **Control Structures**: Java supports various control structures such as:
    - Conditional statements: `if`, `else if`, `else`, `switch`
    - Loops: `for`, `while`, `do-while`
   ```java
        if (myNumber > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Non-positive number");
        }
   ```
6. **Methods**: Methods are blocks of code that perform a specific task and can be called from other parts of the
       program.
       ```java
       public int add(int a, int b) {
           return a + b;
       }
       ```
7. **Comments**: Java supports single-line (`//`) and multi-line (`/* ... */`) comments.
8. **Packages**: Java uses packages to group related classes and interfaces.
   ```java
   package com.example.myapp;
   ```
9. **Import Statements**: To use classes from other packages, you need to import them
10. **Exception Handling**: Java provides a robust exception handling mechanism using `try`, `catch`, `finally`, and
    `throw` keywords.
    ```java
    try {
        // code that may throw an exception
    } catch (ExceptionType e) {
        // handle exception
    } finally {
        // code that will always execute
    }
    ```

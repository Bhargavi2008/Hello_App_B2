/**
 * HelloApp.java – A simple Java application that accepts a user's
 * name as a command-line argument and displays a personalized greeting.
 *
 * UC1: Display "Hello World"
 * UC2: Display User Name from command-line argument
 *
 * @author Developer Name
 * @version 1.0
 * @since UC1
 */

public class HelloApp {

    public static void main(String[] args) {

        // Check if a name argument is provided
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello! Please provide your name as a command-line argument.");
        }
    }
}
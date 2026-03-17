class HelloApp {

    public static void main(String[] args) {

        String greeting;

        // Check if arguments are provided
        if (args.length > 0) {
            // Join all names with comma and space
            String joinedNames = String.join(", ", args);
            greeting = "Hello, " + joinedNames + "!";
        } else {
            // Default message
            greeting = "Hello, World!";
        }

        // Display the greeting
        System.out.println(greeting);
    }
}
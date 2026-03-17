class HelloApp {

    public static void main(String[] args) {

        String greeting;

        // Check if no arguments are provided
        if (args.length == 0) {
            greeting = "Hello, World!";
        } else {

            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            // Enhanced for loop
            for (String name : args) {

                if (!first) {
                    nameBuilder.append(", ");
                }

                nameBuilder.append(name);
                first = false;
            }

            greeting = "Hello, " + nameBuilder.toString() + "!";
        }

        // Print output
        System.out.println(greeting);
    }
}
class HelloApp {

    static void main(String[] args) {

        // Default greeting when no arguments are given
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {

            String names = "";

            // Enhanced for loop to process multiple names
            for (String name : args) {
                names += name + ", ";
            }

            // Remove trailing comma and space using substring()
            names = names.substring(0, names.length() - 2);

            // Print greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}
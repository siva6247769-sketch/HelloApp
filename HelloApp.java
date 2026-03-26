public class HelloApp {

    public static void main(String[] args) {

        // Check if no arguments are passed
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {
            // Join all names using comma and space
            String names = String.join(", ", args);

            // Print greeting message
            System.out.println("Hello, " + names + "!");
        }
    }
} 
    


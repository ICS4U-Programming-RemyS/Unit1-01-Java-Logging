import java.util.Scanner;

/**
* This program will calculate the maximum amount of logs that can fit into a truck based on certain lengths.
*
* @author  Remy Skelton
* @version 1.0
* @since   2025-February-14
*/

final class Logging {
    // Constants
    final int MAX_WEIGHT = 1100;


    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
    */
    private Logging() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(final String[] args) {
        // Welcome message
        System.out.print("This program will calculate ");
        System.out.print("the maximum number of logs that can fit into");
        System.out.println(" a truck based on certain lengths.");

        // Ask user to enter the log lengths
        System.out.println("Please enter the log lengths you will be using: ");

        // Use a scanner to get the log length from user
        final Scanner scanner = new Scanner(System.in);
        final String logLengthString = scanner.nextLine();

        // Try catch to catch users invalid input
        try {
            // convert the string to a double
            final double logLengthDouble = Double.parseDouble(logLengthString);

            // If else statement for invalid log length
            if (logLengthDouble != 0.25 || logLengthDouble != 0.5 || logLengthDouble || 1) {
                System.out.println("Invalid input, "+ logLengthString + " log length must be 0.25, 0.5, or 1.");
            } else {
                // Calculate the weight per log
                final double weightPerLog = 20 * logLengthDouble;

                // Calculate the number of logs
                final double numLogsDouble = MAX_WEIGHT / weightPerLog;

                // Convert the number of logs to an integer
                final int numLogsInt = (int) numLogsDouble;

                // Display the max number of logs
                System.out.print("The truck will be able to take ");
                System.out.print(numLogsInt + " logs that are ");
                System.out.format(logLengthDouble + "m(s) in length.");
            }
        } catch (NumberFormatException error) {
            // error message
            System.out.println("Invalid input. Please enter a valid log length."
                    + error.getMessage());
        }

        // Close the scanner
        scanner.close();
    }
}

import java.util.Scanner;

/**.
 * This program will calculate the maximum amount of logs
 * that can fit into a truck based on certain lengths.
 *
 * @author  Remy Skelton
 * @version 1.0
 * @since   2025-February-14
 */

final class Logging {
    /**.
     * Constants
     */
    private static final int MAX_WEIGHT = 1100;

    /**
     * This is a private constructor used to satisfy the style checker.
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
        System.out.println("This program will calculate the maximum"
        + "number of logs that can fit into a truck based on certain lengths.");

        // Use a scanner to get the log length from the user
        try (Scanner scanner = new Scanner(System.in)) {
            double logLengthDouble;

            // Keep asking for input until a valid log length is entered
            do {
                // Message for input
                System.out.println("Please enter the log length you"
                + "will be using (0.25, 0.5, or 1): ");
                String logLengthString = scanner.nextLine();

                try {
                    logLengthDouble = Double.parseDouble(logLengthString);

                    // Validate input
                    if (logLengthDouble == 0.25
                    || logLengthDouble == 0.5 || logLengthDouble == 1) {
                        // Break the loop if the input is valid
                        break;
                    } else {
                        // Error message for invalid input
                        System.out.println("Invalid input: " + logLengthString
                        + ". Log length must be 0.25, 0.5, or 1.");
                    }
                } catch (NumberFormatException error) {
                    // Error message for invalid input
                    System.out.println("Invalid input: " + logLengthString
                    + ". Log length must be 0.25, 0.5, or 1.");
                }
            // Infinite loop that only breaks when a valid input is given
            } while (true);

            // Calculate the weight per log
            final double weightPerLog = 20 * logLengthDouble;

            // Calculate the number of logs
            final int numLogsInt = (int) (MAX_WEIGHT / weightPerLog);

            // Display the max number of logs
            System.out.println("The truck will be able to take " + numLogsInt
            + " logs that are " + logLengthDouble + "m(s) in length.");
        }
    }
}

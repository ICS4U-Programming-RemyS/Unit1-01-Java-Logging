import java.util.Scanner;

/**
 * This program will calculate the maximum amount of logs that can fit into a truck based on certain lengths.
 *
 * @author  Remy Skelton
 * @version 1.0
 * @since   2025-February-14
 */
final class Logging {
    // Constant
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
        System.out.println("This program will calculate the maximum number of logs that can fit into a truck based on certain lengths.");
        System.out.println("Please enter the log length you will be using (0.25, 0.5, or 1): ");

        // Use a scanner to get the log length from the user
        try (Scanner scanner = new Scanner(System.in)) {
            final String logLengthString = scanner.nextLine();

            // Try to convert the string to a double
            try {
                final double logLengthDouble = Double.parseDouble(logLengthString);

                // Validate input
                if (!(logLengthDouble == 0.25 || logLengthDouble == 0.5 || logLengthDouble == 1)) {
                    System.out.println("Invalid input: " + logLengthString + ". Log length must be 0.25, 0.5, or 1.");
                } else {
                    // Calculate the weight per log
                    final double weightPerLog = 20 * logLengthDouble;

                    // Calculate the number of logs
                    final int numLogsInt = (int) (MAX_WEIGHT / weightPerLog);

                    // Display the max number of logs
                    System.out.print("The truck will be able to take ");
                    System.out.print(numLogsInt + " logs that are ");
                    System.out.format(logLengthDouble + "m(s) in length.");
                    System.out.println();
                }
            } catch (NumberFormatException error) {
                // Error message for invalid number input
                System.out.println("Invalid input. Please enter a valid log length." + error.getMessage());
            }
        }
    }
}

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
    * Max weight as a int constant
    **/
    private static final int MAX_WEIGHT = 1100;
    /**.
    * Quarter of a log as a double constant
    **/
    private static final double QUARTER_LOG_LENGTH = 0.25;
    /**.
    * Quarter of a log as a double constant
    **/
    private static final double HALF_LOG_LENGTH = 0.5;
    /**.
    * Max weight as a int constant
    **/
    private static final double FULL_LOG_LENGTH = 1.0;


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
        System.out.println("This program will calculate the maximum number"
            + " of logs that can fit into a truck based on certain lengths.");

        // Use a scanner to get the log length from the user
        Scanner scanner = new Scanner(System.in);

        // Declare log length double variable
        double logLengthDouble;

        // Do while loop to run until valid log length is entered
        do {
            // Message for input
            System.out.println("Please enter the log length you"
                    + " will be using (0.25, 0.5, or 1): ");
            String logLengthString = scanner.nextLine();

            try {
                // Convert double to string to double
                logLengthDouble = Double.parseDouble(logLengthString);

                // If statement for valid input
                if (logLengthDouble == QUARTER_LOG_LENGTH
                        || logLengthDouble == HALF_LOG_LENGTH
                        || logLengthDouble == FULL_LOG_LENGTH) {
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
        // While True for infinite loop until break
        } while (true);

        // Calculate the weight per log
        final double weightPerLog = 20 * logLengthDouble;

        // Calculate the number of logs
        final int numLogsInt = (int) (MAX_WEIGHT / weightPerLog);

        // Display the max number of logs
        System.out.println("The truck will be able to take " + numLogsInt
                + " logs that are " + logLengthDouble + "m(s) in length.");
    // Close scanner
    scanner.close();
    }
}

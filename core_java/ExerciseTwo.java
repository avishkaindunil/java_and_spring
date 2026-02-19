public class ExerciseTwo {
    public static void main(String[] args) {
        
        double num1 = 7;
        double num2 = 3;
        char operator = '+';
        String again = "y"; 

        // Run the loop while 'again' equals 'y'
        while (again.equals("y")) {

            // Perform the calculation based on the operator
            if (operator == '+') {
                System.out.println("Result: " + (num1 + num2));

            } else if (operator == '-') {
                System.out.println("Result: " + (num1 - num2));

            } else if (operator == '*') {
                System.out.println("Result: " + (num1 * num2));

            } else if (operator == '/') {
                // Check if num2 is zero before division
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
            }

            // Stop the loop after one execution
            again = "n";
        }

        // Display thank you message
        System.out.println("Thank you for using the calculator.");
    }
}

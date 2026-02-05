import java.util.Scanner;

public class grossPayCalculator {
    public static void main(String[] args){
        double hoursWorked = 0;
        double payRate = 0;
        int quota = 10;
        int maxHours = 40;
        int runAgain = 0;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("How many hours did you worked: ");
            hoursWorked = scanner.nextDouble();

            while(hoursWorked > maxHours){
                System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again");
                System.out.print("Enter your correct worked hours: ");
                hoursWorked = scanner.nextDouble();
            }

            System.out.print("What is your pay rate: ");
            payRate = scanner.nextDouble();

            System.out.print("How many sales did you make this week: ");
            int sales = scanner.nextInt();

            System.out.print("Enter your letter grade: ");
            String grade = scanner.next();

            System.out.println();

            String message = switch(grade){
            case "A" -> "Exellent Job!";
            case "B" -> "Great Job!";
            case "C" -> "Good Job!";
            case "D" -> "you need to work bit harder";
            case "F" -> "uh oh!";
            default -> "Error! Invalid Grade";
            };

            System.out.println(message);

            if(sales >= quota){
                System.out.println("Congrats! You've met your quota.");
            } else {
                int salesShort = quota - sales;
                System.out.println("You did not make your quota. You were " + salesShort + " sales shorts.");
            }

            double grossPay = hoursWorked * payRate;

            System.out.println("Gross Pay: " + grossPay +"$");
            System.out.println();
            System.out.println("Would you like to start over? Enter 1 for YES, and 2 for NO.");

            runAgain = scanner.nextInt();

        } while(runAgain == 1);

        scanner.close();
    }
}

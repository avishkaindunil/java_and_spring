import java.util.Scanner;

public class grossPayCalculator {
    public static void main(String[] args){
        double hoursWorked = 0;
        double payRate = 0;
        int quota = 10;
        int maxHours = 40;

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many hours did you worked: ");
        hoursWorked = scanner.nextDouble();

        System.out.print("What is your pay rate: ");
        payRate = scanner.nextDouble();

        System.out.print("How many sales did you make this week: ");
        int sales = scanner.nextInt();

        System.out.print("Enter your letter grade: ");
        String grade = scanner.next();

        while(hoursWorked > maxHours){
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again");
            System.out.print("Enter your correct worked hours: ");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        double grossPay = hoursWorked * payRate;

        String message = switch(grade){
            case "A" -> "Exellent Job!";
            case "B" -> "Great Job!";
            case "C" -> "Good Job!";
            case "D" -> "you need to work bit harder";
            case "F" -> "uh oh!";
            default -> "Error! Invalid Grade";
        };

        if(sales >= quota){
            System.out.println("Congrats! You've met your quota.");
        } else {
            int salesShort = quota - sales;
            System.out.println("You did not make your quota. You were " + salesShort + " sales shorts.");
        }

        System.out.println(message);
        System.out.println("Gross Pay: " + grossPay +"$");
    }
}

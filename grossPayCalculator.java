import java.util.Scanner;

public class grossPayCalculator {
    public static void main(String[] args){
        int hours = 0;
        double payRate = 0;
        int quota = 10;

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many hours did you worked: ");
        hours = scanner.nextInt();

        System.out.print("What is your pay rate: ");
        payRate = scanner.nextDouble();

        System.out.print("How many sales did you make this week: ");
        int sales = scanner.nextInt();

        System.out.print("Enter your letter grade: ");
        String grade = scanner.next();

        scanner.close();

        double grossPay = hours * payRate;

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

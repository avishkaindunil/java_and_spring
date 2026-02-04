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

        scanner.close();

        double grossPay = hours * payRate;

        if(sales >= quota){
            System.out.println("Congrats! You've met your quota.");
        }

        System.out.println("Gross Pay: " + grossPay +"$");
    }
}

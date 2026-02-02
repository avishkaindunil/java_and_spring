import java.util.Scanner;

public class grossPayCalculator {
    public static void main(String[] args){
        int hours = 0;
        double payRate = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many hours did you worked: ");
        hours = scanner.nextInt();

        System.out.print("What is your pay rate: ");
        payRate = scanner.nextDouble();

        scanner.close();

        double grossPay = hours * payRate;

        System.out.println("Gross Pay: " + grossPay +"$");
    }
}

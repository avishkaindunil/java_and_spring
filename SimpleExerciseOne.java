import java.util.Scanner;

public class SimpleExerciseOne {

    public static void printOneToN(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Done");
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            printOneToN(number);
        }
    }
}

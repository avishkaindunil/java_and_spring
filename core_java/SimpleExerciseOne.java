import java.util.Scanner;

public class SimpleExerciseOne {

    public static void printOneToN(int n) {

        long startTime = System.nanoTime();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Done");
        long endTime = System.nanoTime();

        long durationInNano = endTime - startTime;
        long durationInMillis = durationInNano / 1_000_000;
        double durationInSeconds = (double) durationInNano / 1_000_000_000.0;

        System.out.println("Execution time in nanoseconds: " + durationInNano);
        System.out.println("Execution time in milliseconds: " + durationInMillis);
        System.out.println("Execution time in seconds: " + durationInSeconds);
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            printOneToN(number);
        }
    }
}

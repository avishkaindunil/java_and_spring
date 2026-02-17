import java.util.Scanner;

public class Fibonacci {

    public static void printFibonacci(int n) {

        if (n <= 0) return;

        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        printFibonacci(n);
    }
}


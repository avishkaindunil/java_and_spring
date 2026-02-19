import java.util.Scanner;

public class MaxSquareFarmMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] land = new int[rows][cols];

        System.out.println("Enter the land matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                land[i][j] = sc.nextInt();
            }
        }

        sc.close();

        findAndPrintBestSquare(land);
    }

    private static void findAndPrintBestSquare(int[][] land) {

        int rows = land.length;
        int cols = land[0].length;

        int[][] dp = new int[rows][cols];

        int maxSide = 0;
        int endRow = -1;
        int endCol = -1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (land[i][j] == 1) {

                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = 1 + Math.min(
                                Math.min(dp[i - 1][j], dp[i][j - 1]),
                                dp[i - 1][j - 1]
                        );
                    }

                    if (dp[i][j] > maxSide) {
                        maxSide = dp[i][j];
                        endRow = i;
                        endCol = j;
                    }
                }
            }
        }

        if (maxSide == 0) {
            System.out.println("No good land square found.");
            return;
        }

        int startRow = endRow - maxSide + 1;
        int startCol = endCol - maxSide + 1;

        System.out.println("\nBest square to farm:");

        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(land[i][j] + " ");
            }
            System.out.println();
        }

        int area = maxSide * maxSide;
        System.out.println("\nArea to farm = " + area);
    }
}

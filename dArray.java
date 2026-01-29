public class dArray {
    public static void main(String[] args){
        int matrix[][][] = new int[5][5][5];

        for(int l=0; l<5; l++){
            for(int m=0; m<5; m++){
                for(int n=0; n<5; n++){
                    System.out.print(matrix[l][m][n] + " ");
                }
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }
}

public class jaggedArray {
    public static void main(String[] args){
        int matrix[][] = new int[3][];

        matrix[0] = new int[4];
        matrix[1] = new int[3];
        matrix[2] = new int[5];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j] = (int)(Math.random() * 10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int matrixTwo[][] = new int[4][];

        matrixTwo[0] = new int[6];
        matrixTwo[1] = new int[2];
        matrixTwo[2] = new int[5];
        matrixTwo[3] = new int[10];

        for(int rows[] : matrixTwo){
            for(int elements : rows){
                System.out.print(elements + " ");
            }
            System.out.println();
        }
    }
}

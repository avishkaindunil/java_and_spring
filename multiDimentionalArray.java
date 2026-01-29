public class multiDimentionalArray {
    public static void main(String[] args){
        int num1[][] = new int[5][5];
        int num2[][] = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                // num[i][j] = 1;
                System.out.print(num2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Assigning values to Multi Dimentional Array: " + "\n");
        for(int m=0; m<5; m++){
            for(int n=0; n<5; n++){
                num1[m][n] = (int)(Math.random() * 10);
                System.out.print(num1[m][n] + " ");
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Enhanced For Loop in Multi Dimentional Array: " + "\n");
        for(int o[] : num1){
            for(int p : o){
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }
    
}

public class array {
    public static void main(String[] args){
        int num[] = {1, 2, 3, 4, 5};

        System.out.println(num[0]);

        int num2[] = new int[5];

        num2[0] = 2;
        num2[1] = 4;
        num2[2] = 6;
        num2[3] = 8;
        num2[4] = 10;

        for(int i=0; i<5; i++){
            System.out.print(num2[i] + " ");
        }
    }
    
}

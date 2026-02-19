public class maxNumber {
    public static void main(String[] args){
        int num[] = {2, 5, 6, 10, 97};
        int max = num[0];
        int sum = 0;

        for(int i=0; i<num.length; i++){
            sum = sum + num[i];
            if(max<num[i]){
                max = num[i];
            }
        }
        System.out.println("Maximum number is: " + max + " and sum is: " + sum);
    }
}

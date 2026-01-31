public class numReverse {
    public static void main(String[] args){
        int num[] = {2,4,6,8,10};
        int reversed[] = new int[num.length];
        
        for(int i=0; i<num.length; i++){
            reversed[i] = num[num.length - i - 1];
            if(i == num.length - 1){
                System.out.print(reversed[i]);
            } else {
                System.out.print(reversed[i] + ", ");
            }
        }
    }
}

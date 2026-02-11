public class sampleExerciseTwo {
    public static void main(String[] main){
        char arr[] = {'a', 'b', 'c', 'd', 'e'};

        for(int i=0; i<arr.length; i++){
            char reversedArr = arr[arr.length-i-1];
            if(i==arr.length-1){
                System.out.print(reversedArr + "}");
            }
            else if(i==0){
                System.out.print("{" + reversedArr + ", ");
            }
            else{
                System.out.print(reversedArr + ", ");
            }
        }
    }
}

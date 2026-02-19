public class sampleExerciseTwo {
    public static void main(String[] main){
        char arr[] = {'a', 'b', 'c', 'd', 'e'};
        String str = "Avishka";
        char newArr[] = new char[str.length()];

        for(int i=0; i<arr.length; i++){
            char reversedArr = arr[arr.length-i-1];
            if(i==arr.length-1){
                System.out.print(reversedArr + "}" + "\n");
            }
            else if(i==0){
                System.out.print("{" + reversedArr + ", ");
            }
            else{
                System.out.print(reversedArr + ", ");
            }
        }

        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for(int j=0; j<str.length(); j++){
            newArr[j] = str.charAt(j);
            System.out.print(newArr[j] + " ");
        }
    }
}

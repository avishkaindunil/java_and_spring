import java.util.Scanner;

public class sampleExerciseOne{
    public static void main(String[] args){
        int arr[] = new int[5];

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 5 numbers: ");
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        arr[2] = scanner.nextInt();
        arr[3] = scanner.nextInt();
        arr[4] = scanner.nextInt();

        scanner.close();

        System.out.print("Your numbers are: { ");

        for(int i = 0; i < arr.length; i++){
            if(i==arr.length - 1){
                System.out.print(arr[i] + " }");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }

        
   }
}
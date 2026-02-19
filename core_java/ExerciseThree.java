public class ExerciseThree {
    public static void main(String[] args) {
        
        int numbers[] = {45, 22, 89, 16, 90, 33};
        int max = numbers[0];
        int min = numbers[0];
        
        for(int num : numbers){
            if(num > max){
                max = num;
            } else if(num < min){
                min = num;
            }
        }
        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }
}
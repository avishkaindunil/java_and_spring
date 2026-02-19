public class While {
    public static void main(String[] args){
        int i=1;

        while(true){
            if(i <= 9999998){
                System.out.println("Hi " + i);
                i++;
            } else {
                break;
            }
            
        }
    }
} 

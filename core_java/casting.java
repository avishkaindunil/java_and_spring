public class casting {
    public static void main(String[] args) {
        byte b = 127;
        int a = 256;
        int c = 12;

        a = b; // implicit casting

        System.out.println(a);

        b = (byte)c; // explicit casting

        System.out.println(b);
        
    }
}
public class logicalOperator{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        boolean result = a < b && b < c ;

        // Logical AND
        // if (result = (a < b && b < c)) {
        //     System.out.println("Both conditions are true");
        // }

        System.out.println(result);

        // Logical OR
        if (a > b || b < c) {
            System.out.println("At least one condition is true");
        }

        // Logical NOT
        if (!(a > b)) {
            System.out.println("Condition is false");
        }
    }
}

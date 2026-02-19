public class stringBuffer {
    public static void main(String[] args){
        StringBuffer str = new StringBuffer("Avishka");

        System.out.println(str.capacity());
        System.out.println(str.charAt(0));
        System.out.println(str.length());
        System.out.println(str.append(" Indunil"));
        System.out.println(str.capacity());
        System.out.println(str.toString());
    }
}

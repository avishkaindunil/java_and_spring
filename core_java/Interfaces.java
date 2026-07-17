interface A {
    int age = 25; //Both vairbale are final and static in interface
    String city ="Mumbai";

    void show();
    void config();
}

class B implements A{
    public void show(){
        System.out.println("In Show");
    }

    public void config(){
        System.out.println("In Config");
    }
}

public class Interfaces {
    public static void main(String arg[]){
         A obj = new B();
         obj.show();
         obj.config();
         
         System.out.println(A.age);
         System.out.println(A.city);
    }
}

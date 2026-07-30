interface A {
    int age = 25; //Both vairbale are final and static in interface
    String city = "Mumbai";

    // age = 26; //Cannot reassign

    void show(); //every method in interface is public abstract
    void config();
    void run();
}

interface C {
    void run();
}

interface D extends C{

}

class B implements A,C{
    public void show(){
        System.out.println("In Show");
    }

    public void config(){
        System.out.println("In Config");
    }

    public void run(){
        System.out.println("In Run");
    }
}

public class Interfaces {
    public static void main(String arg[]){
         A obj = new B();
         obj.show();
         obj.config();
         obj.run();
         
         System.out.println(A.age);
         System.out.println(A.city);
    }
}

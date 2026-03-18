class A{
    int x;

    A(int value){
        this.x = value;
    }

    public void show(){
        x = 20;
        System.out.println("Class A: " + x);
    }
}

class B{
    int y;

    B(A obj){
        y = obj.x;
    }

    public void show(){
        System.out.println("Class B: " + y);
    }
}


public class SCS1209 {
    public static void main(String[] args){
        A a = new A(10);
        a.show();

        B b = new B(a);
        b.show();

    }
}

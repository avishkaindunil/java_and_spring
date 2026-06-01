class A {
    public void show(){
        System.out.println("In A show");
    }
}

public class AnonymousClass{
    public static void main(String[] args){
        A obj = new A() {
            public void show(){ //THIS IS CALL AS ANONYMOUS CLASS
                System.out.println("In new show");
            }
        };
        obj.show();
    }
}
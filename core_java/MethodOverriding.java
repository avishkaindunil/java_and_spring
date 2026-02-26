class A{
    public void show(){
        System.out.println("In A Show");
    }

    public void config(){
        System.out.println("In A Config");
    }
}

class B extends A{
    public void show(){ //This method overriding the show() method in class A and this call method overriding
        System.out.println("In B Show");
    }
}

public class MethodOverriding {
    public static void main(String[] args){
        B obj = new B();
        obj.show();
        obj.config();
    }
}

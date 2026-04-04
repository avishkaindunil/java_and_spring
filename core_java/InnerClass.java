class A {
    public void show(){
        System.out.println("In A");
    }

    class B {
        public void config() {
            System.out.println("In B");
        }
    }

    static class C {
        public void configTwo() {
            System.out.println("In C");
        }
    }
}

public class InnerClass {
    public static void main(String[] args){
        A obj = new A();
        obj.show();

        A.B obj2 = obj.new B();
        obj2.config();

        A.C obj3 = new A.C();
        obj3.configTwo();
    }
}


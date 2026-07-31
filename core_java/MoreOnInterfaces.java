// abstract class Computer {
//     public abstract void code();
// }

// Instead of using abstract class, can use interfaces

interface Computer {
    void code();
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Code, Compile, Run : Faster");
    }
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Code, Compile, Run");
    }
}

class Developer{
    public void devApp(Computer lap){
        lap.code();
    }
}

public class MoreOnInterfaces {
    public static void main (String[] args){
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer avishka = new Developer();

        avishka.devApp(desk);
    }
}

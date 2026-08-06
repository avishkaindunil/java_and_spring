interface Machine{
    String start();
}

abstract class Appliance implements Machine{
    protected final String name;
    
    Appliance(String name){
        this.name = name;
    }
}

class Fan extends Appliance{
    Fan(String name) {
        super(name);
    }

    @Override
    public String start(){
        return name + " is running";
    }
}

class WashingMachine extends Appliance{
    WashingMachine(String name){
        super(name);
    }

    @Override
    public String start(){
        return name + " is operating";
    }
}

public class AbstractExercise {
    public static void main(String[] args) {
        Machine fan = new Fan("Fan");
        Machine washer =  new WashingMachine("Washing Machine");
        
        System.out.println(fan.start());
        System.out.println(washer.start());
    }
} 

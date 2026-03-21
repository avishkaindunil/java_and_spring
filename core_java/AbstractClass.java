abstract class Car{
    public abstract void drive();
    public abstract void fly();
    
    public void playing(){
        System.out.println("Music is playing");
    }
}

abstract class WagonR extends Car{
    @Override
    public void drive(){
        System.out.println("Driving");
    }
}

class UpdatedCar extends WagonR{ // this is a concrete class
    @Override
    public void fly(){
        System.out.println("Flying");
    }
}

class AbstractClass {
    public static void main(String[] args){
        Car obj = new UpdatedCar(); // NOTE: cannot creat an object from abstract class
        obj.drive();
        obj.playing();
        obj.fly();
    }
}
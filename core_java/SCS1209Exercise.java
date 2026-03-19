class Engine{
    private int cylinders;
    private double liters;

    public void setCylinders(int c){
        this.cylinders = c;
    }

    public int getCylinders(){
        return cylinders;
    }

    public void setLiters(double l){
        this.liters = l;
    }

    public double getLiters(){
        return liters;
    }

    public Engine(int c, double l){
        this.cylinders = c;
        this.liters = l;
    }
}

public class SCS1209Exercise {
    public static void main(String[] args){
        Engine engOne = new Engine(4,1.3);
        System.out.println("Constructor Engine called: ");
        System.out.println("Cylinders: " + engOne.getCylinders());
        System.out.println("Liters: " + engOne.getLiters());
    }
}

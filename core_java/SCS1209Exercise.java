class Engine{
    private int cylinders;
    private double liters;

    public void setCylinders(int c){
        this.cylinders = c;
    }

    public int getCylinders(int c){
        return c;
    }

    public void setLiters(double l){
        this.liters = l;
    }

    public double getLiters(double l){
        return l;
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
        System.out.println("Cylinders: " + engOne.getCylinders(4));
        System.out.println("Liters: " + engOne.getLiters(1.3));
    }
}

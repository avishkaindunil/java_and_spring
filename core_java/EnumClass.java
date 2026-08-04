enum Laptop {
    MacBook(2000),
    XPS(1500),
    Surface,
    ThinkPad(1000);

    private int price;

    private Laptop() {
        price = 800;
    }

    private Laptop(int price){
        this.price = price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}

public class EnumClass {

    public static void main(String[] args){
        Laptop lap = Laptop.MacBook;

        System.out.println(lap.getClass().getSuperclass());

        System.out.println(lap + ": " + lap.getPrice());

        for (Laptop laps : Laptop.values()){
            System.out.println(laps + ": " + laps.getPrice());
        }
    }
}
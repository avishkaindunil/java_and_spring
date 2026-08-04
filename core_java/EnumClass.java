enum Laptop {
    MacBook(2000),
    XPS(1500),
    Surface(1200),
    ThinkPad(1000);

    private int price;

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
        Laptop[] laptops = Laptop.values(); 

        System.out.println(lap.getClass().getSuperclass());

        System.out.println(lap + ": " + lap.getPrice());

        for (Laptop laps : laptops){
            System.out.println(laps + ": " + laps.getPrice());
        }
    }
}
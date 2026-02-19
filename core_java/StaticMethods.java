class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class StaticMethods {
    public static void main(String[] args){
        Mobile obj = new Mobile();
        obj.brand = "Apple";
        obj.price = 1500;
        Mobile.name = "Smart Phone";

        obj.show();

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1200;
        Mobile.name = "SmartPhone";

        obj2.show();
        obj.show();
    }
}

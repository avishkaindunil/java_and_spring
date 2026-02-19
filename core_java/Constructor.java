class Human {

    private int age;
    private String name;

    Human() { //Default Constructor
        age = 12;
        name = "Reddy";
    }

    Human(int age, String name) { //Parameterized Constructor
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Constructor {
    public static void main(String[] args){
        Human obj = new Human();
        // obj.setAge(15);
        // obj.setName("Avishka");
        System.out.println(obj.getName() + ": " + obj.getAge());
    }
}

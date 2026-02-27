class Calculator {
    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2){
        return n1 + n2;
    }

    public double add(double n1, int n2){
        return n1 + n2;
    }

    //In this class has three different methods containg same method names, same return types and different parameters. So, in this case called as METHOD OVERLOADING
}

public class methodOverloading{
    public static void main(String[] args){
        Calculator calc = new Calculator();
        int result = calc.add(1, 5, 4);
        System.out.println(result);
    }
}
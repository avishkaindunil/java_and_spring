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

    public long add(long n1, long n2){
        return n1 + n2;
    }

    //In this class has three different methods containg same method names, same return types and different parameters. So, in this case called as METHOD OVERLOADING
}

public class methodOverloading{
    public static void main(String[] args){
        Calculator calc = new Calculator();
        long result = calc.add(9460730472580800L, 9460730472580800L);
        System.out.println(result);
    }
}

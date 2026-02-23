class Calc{ //Super, Parent, Base Class
    public int add(int n1, int n2){
        return n1+n2;
    }

    public int sub(int n1, int n2){
        return n1-n2;
    }

    //We can write these two classes outside. If you want to use Calc class in AdvCalc class; you only need the .class file of Calc class
}

class AdvCalc extends Calc{ //Sub, Child, Derrived Class
    public int multi(int n1, int n2){
        return n1*n2;
    }

    public int div(int n1, int n2){
        return n1/n2;
    }
}

class VeryAdvCalc extends AdvCalc{ //In this class represennt multilevel inheritance
    public double power(int n1, int n2){
        return Math.pow(n1, n2);
    }
}

public class SimpleInheritance {
    public static void main(String[] args){
        VeryAdvCalc advCalc = new VeryAdvCalc();
        int r1 = advCalc.add(5, 4);
        int r2 = advCalc.sub(5, 4);
        int r3 = advCalc.multi(5, 4);
        int r4 = advCalc.div(5, 4);
        int r5 = (int)advCalc.power(5, 4);

        System.out.println(r1 + " " +r2 + " " + r3 + " " + r4 + " " + r5);
    }
}

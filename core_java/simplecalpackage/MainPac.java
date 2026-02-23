package simplecalpackage;

import simplecalpackage.tools.Calc;
import simplecalpackage.tools.AdvCalc;
import simplecalpackage.tools.VeryAdvCalc;

public class MainPac {
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

import Damini.Riya.advcalc;
import Damini.Riya.calc;

public class RiyaPackageDemo {
    public static void main(String a[]) {
        calc obj = new calc();
        advcalc obj2 = new advcalc();
        System.out.println(obj.add(1, 2));
        System.out.println(obj2.multi(2, 4));
    }
}

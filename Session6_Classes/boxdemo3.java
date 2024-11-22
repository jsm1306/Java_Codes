class Boxa{
    double width;
    double height;
    double depth;
}
public class boxdemo3 {
    public static void main(String[] args) {
        Boxa mybox1 = new Boxa();
        Boxa mybox2 = new Boxa();
        double vol;
        mybox1.width = -10;
        mybox1.height = 30;
        mybox1.depth = 50;
        mybox2.width = 3;
        mybox2.height = -3;
        mybox2.depth=-7;
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("volume is = " + vol);
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("volume is = " + vol);
    }
}
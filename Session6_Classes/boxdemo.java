class Box{
    double width, height, depth;
}
public class boxdemo {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        double vol;
        mybox1.width = 20;
        mybox1.height = 30;
        mybox1.depth = 5;
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Volume is " +  vol);
    }
}

class Box4 {
    double width,height,depth;
    Box4(){
        width = -10;
        height = 30;
        depth = 50;
    }
    double volume(){
        return width * height * depth;
    }
}
public class boxdemo5 {
    public static void main(String[] args) {
        Box4 box = new Box4();
        double vol = box.volume();
        System.out.println("Volume is " + vol);
    }
}
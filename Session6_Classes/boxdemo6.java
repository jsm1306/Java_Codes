class Box5 {
    double width,height,depth;
    Box5(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }
    double volume() {
        return width * height * depth;
    }
}
public class boxdemo6 {
    public static void main(String[] args) {
        Box5 box = new Box5(10, 30, 50);
        double vol = box.volume();
        System.out.println("Volume is " + vol);
        
    }
}

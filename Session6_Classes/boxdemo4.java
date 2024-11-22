class Box3{
    double width;
    double height;
    double depth;

    double volume(){
        return width*height*depth;
    }
    void setdimensions(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
}
public class boxdemo4 {
    public static void main(String[] args) {
        Box3 mybox = new Box3();
        Box3 mybox2 = new Box3();
        double vol;
        mybox.setdimensions(10,50,20);
        mybox2.setdimensions(33,80,40);
        vol=mybox.volume();
        System.out.println("volume is " + vol);
        vol=mybox2.volume();
        System.out.println("volume is " + vol);
    }

}

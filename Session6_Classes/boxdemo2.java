class box2{
    double width;
    double height;
    double depth;
    void volume(){
        System.out.print("Volume is ");
        System.out.println(width*height*depth);
    }}
public class boxdemo2 {
    public static void main(String[] args) {
        box2 mybox = new box2();
        box2 mybox2 = new box2();
        mybox.width = 4;
        mybox.height =5;
        mybox.depth=6;
        mybox2.width =7;
        mybox2.height = 8;
        mybox2.depth = 9;
        mybox.volume();
        mybox2.volume();
    }}
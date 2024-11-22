class box33{
    double width,depth,height;
    box33(double w, double d, double h){
        width=w;depth=d;height=h;
    }
    box33(){
        width=-1;depth=-1;height=-1;
    }
    box33(double len){
        width=height=depth=len;
    }
    double volume(){
        return width*depth*height;
    }}
public class overloadconstructor {
    public static void main(String[] args) {
        box33 mybox1=new box33(2.5,3.5,4.5);
        box33 mybox2=new box33();
        box33 mybox3=new box33(7);
        double vol;
        vol=mybox1.volume();
        System.out.println("Volume of my box1 is: "+vol);
        vol=mybox2.volume();
        System.out.println("Volume of my box2 is: "+vol);
        vol=mybox3.volume();
        System.out.println("Volume of my box3 is: "+vol);
    }}
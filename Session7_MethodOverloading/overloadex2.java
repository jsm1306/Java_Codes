class overloaddemo3{
    void test(){
        System.out.println("No parameters");
    }
    void test(int a, int b){
        System.out.println("a and b: "+a+" "+b);
    }
    void test(double a){
        System.out.println("Double a: "+a);
    }
}
public class overloadex2 {
    public static void main(String[] args) {
        overloaddemo3 obj=new overloaddemo3();
        int i=23;
        obj.test();
        obj.test(10,20);
        obj.test(i);
        obj.test(123.34);
    }
}

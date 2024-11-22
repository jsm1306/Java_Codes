class overloaddemo{
    void test(){
        System.out.println("No parameters");
    }
    void test(int a){
        System.out.println("This is a: "+ a);
    }
    void test(int a, int b){
        System.out.println("This is a: "+a+" , this is b: "+b);
    }
    double test(double a){
        System.out.println("This is double variable a: "+ a);
        System.out.println("And the square of number is: ");
        return a*a;
    }
}
public class overload {
    public static void main(String[] args) {
        overloaddemo obj= new overloaddemo();
        double result;
        obj.test();
        obj.test(10);
        obj.test(10,20);
        result= obj.test(10.23);
        System.out.println(result);
    }
}

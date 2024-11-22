class BaseClass{
    void display(){
        System.out.println("This is a BaseClass");
    }
}
class DerivedClass extends BaseClass{
    @Override
    void display(){
        System.out.println("This is a DerivedClass");
    }
    void display(String message){
        System.out.println(message + "Hello World");
    }
}
public class Example {
    public static void main(String[] args) {
        DerivedClass dc = new DerivedClass();
        BaseClass bc = new BaseClass();
        dc.display(); // Overridden DerivedClass Method
        bc.display(); // BaseClass Method
        dc.display("Good Morning"); // MethodOverloading

    }
}
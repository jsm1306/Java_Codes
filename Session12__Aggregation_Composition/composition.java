class Engine{
    Engine(){
        System.out.println("Engine started");
    }
}
class Car{
    private final Engine engine;
    Car(){
        engine=new Engine();
        System.out.println("Car has been created");
    }
}
public class composition {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
    }
}

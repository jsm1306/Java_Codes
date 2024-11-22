class Vehicle {

    Vehicle() {
        System.out.print("Vehicle constructor is called");
    }
}

class Caru extends Vehicle {
    Caru() {
        super();
        System.out.print("Car constructor is called");
    }
}

public class inheritancebasic {
    public static void main(String[] args) {
        Caru car = new Caru();
    }
}
interface Movable {
    void move();
}

interface Chargeable {
    void charge();
}

class ElectricCar2 implements Movable, Chargeable {
    public void move() {
        System.out.println("car is moving");
    }

    public void charge() {
        System.out.println("car is charging");
    }
}

public class Multiple_interfcae {
    public static void main(String[] args) {
        ElectricCar2 car = new ElectricCar2();
        car.move();
        car.charge();
    }
}

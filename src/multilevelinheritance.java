class Vehicle12 {
    String make;
    String model;

    void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }
}

class Car12 extends Vehicle12 {
    int numberOfDoors;

    void displayCarInfo() {
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class ElectricCar extends Car12 {
    int batteryCapacity; // in kWh

    void displayElectricCarInfo() {
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

public class multilevelinheritance {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        tesla.make = "Tesla";
        tesla.model = "Model 3";
        tesla.numberOfDoors = 4;
        tesla.batteryCapacity = 75;

        tesla.displayInfo();
        tesla.displayCarInfo();
        tesla.displayElectricCarInfo();
    }
}

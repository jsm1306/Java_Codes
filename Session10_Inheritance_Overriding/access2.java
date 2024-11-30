class Animalx {
    String name = "Animal";
}

class Dogx extends Animalx {
    String name = "Dog";

    void printName() {
        System.out.println(super.name);
        System.out.println(name);
    }
}

public class access2 {
    public static void main(String[] args) {
        Dogx obj = new Dogx();
        obj.printName();
    }
}
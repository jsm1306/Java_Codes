interface swimmable {
    static void floatonwater() {
        System.out.println("floating on water");
    }

    void swim();

    default void dive() {
        System.out.println("diving underwater");
    }
}

class Fish implements swimmable {
    public void swim() {
        System.out.println("fish is swimmable");
    }
}

public class Interface_Example {
    public static void main(String[] args) {
        Fish goldfish = new Fish();
        goldfish.swim();
        goldfish.dive();
        swimmable.floatonwater();
    }
}

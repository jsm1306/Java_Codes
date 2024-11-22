class Actor {
    void cut() {
        System.out.println("cut, scene has ended for an actor");
    }
}

class Surgeon extends Actor {
    @Override
    void cut() {
        System.out.println("cut, has been made to skin by surgeon");
    }
}

class Hairdresser extends Actor {
    @Override
    void cut() {
        System.out.println("cut, is performed to hair by hairdresser");
    }
}

public class dynamicploymorph {
    public static void main(String[] args) {
        Actor a1;
        a1 = new Actor();
        a1.cut();
        a1 = new Surgeon();
        a1.cut();
        a1 = new Hairdresser();
        a1.cut();
    }
}
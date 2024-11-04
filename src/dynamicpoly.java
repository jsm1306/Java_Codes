class engine {
    void start() {
        System.out.println("engine is started");
    }
}

class car extends engine {
    @Override
    void start() {
        System.out.println("car is started");
    }
}

class truck extends engine {
    @Override
    void start() {
        System.out.println("truck is started");
    }
}

public class dynamicpoly {
    public static void main(String[] args) {
        engine myengine;
        myengine = new car();
        myengine.start();// Output: car is started
        myengine = new truck();
        myengine.start();// Output: truck is started
    }
}

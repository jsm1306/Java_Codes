class World1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(" World");
        }
    }
}

public class Test1 {
    public static void main(String[] args) {
        World1 w = new World1();
        Thread thread = new Thread(w);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello ");
        }
    }
}

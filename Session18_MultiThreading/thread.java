class World extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(" World");
        }
    }
}

public class thread {
    public static void main(String[] args) {
        World w = new World();
        w.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello ");
        }
    }
}

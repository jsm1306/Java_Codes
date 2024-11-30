class World1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(" World");
        }
    }
}

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        World1 w = new World1();

        Thread thread = new Thread(w);
        System.out.println(Thread.currentThread().getName() + " " + thread.getState());

        thread.start();
        System.out.println(Thread.currentThread().getName() + " " + thread.getState());
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello ");
        }
        System.out.println(Thread.currentThread().getName() + " " + thread.getState());
        thread.join();
        System.out.println(Thread.currentThread().getName() + " " + thread.getState());

    }
}

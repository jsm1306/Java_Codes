class WorkerThread extends Thread {
    public WorkerThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + ": Task " + i);
        }
    }
}

public class ThreadNamingExample {
    public static void main(String[] args) {
        WorkerThread thread1 = new WorkerThread("WorkerThread");
        WorkerThread thread2 = new WorkerThread("HelperThread");
        thread1.start();
        thread2.start();
    }
}
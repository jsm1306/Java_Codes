class A3 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Thread 1: Riya coming from thread A3");
        }
    }
}

class B3 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Thread 2: Damini - coming from thread B3");
        }
    }
}

public class MultiThreadExample3 {
    public static void main(String[] args) {
        A3 threadA = new A3();
        B3 threadB = new B3();
// Setting thread priorities
        threadA.setPriority(Thread.MAX_PRIORITY); // Highest priority (10)
        threadB.setPriority(Thread.MIN_PRIORITY); // Lowest priority (1)
// Start both threads
        threadA.start();
        threadB.start();
    }
}

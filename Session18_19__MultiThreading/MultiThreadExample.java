class A1 extends Thread {

    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Riya");
        }
    }
}

class B1 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Damini");
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        A1 threadA = new A1();
        B1 threadB = new B1();
        threadA.start();
        threadB.start();
    }
}
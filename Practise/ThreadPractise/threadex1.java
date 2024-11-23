package ThreadPractise;

class a extends Thread {
    public void run() {
        for (int i = 1; i <= 30; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}

class b extends Thread {
    public void run() {
        for (int i = 1; i <= 30; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}

public class threadex1 {
    public static void main(String[] args) {
        a obj = new a();
        b obj1 = new b();
        obj.start();
        obj1.start();
    }
}

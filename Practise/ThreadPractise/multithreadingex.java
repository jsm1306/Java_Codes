package ThreadPractise;

class multithreadingex extends Thread {
    public int threadnumber;

    public multithreadingex(int threadnumber) {
        this.threadnumber = threadnumber;
    }

    public static void main(String[] a) {
        for (int i = 1; i <= 5; i++) {
            multithreadingex t = new multithreadingex(i);
            t.start();
        }
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "from thread-" + threadnumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

}
class MultiThreadingg extends Thread {
    private int threadNumber;

    public MultiThreadingg(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "from Thread " + threadNumber);
            try {
                Thread.sleep(1000); // Pauses for 1000 milliseconds (1 second)
            } catch (InterruptedException e) {
// Handle the exception if the thread is interrupted during sleep
                e.printStackTrace();
            }
        }
    }

    public class MultiThreading2 {
        public static void main(String[] args) {
            for (int i = 0; i <= 3; i++) {
                MultiThreadingg myThing = new MultiThreadingg(i);
                myThing.start();
            }
        }
    }
}
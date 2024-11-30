class SharedResource {
    private boolean isProduced = false;

    // Producer method
    public synchronized void produce() throws InterruptedException {
        while (isProduced) {
            wait();  // Wait if the message is already produced
        }
        System.out.println("Produced message");
        isProduced = true;
        notify();  // Notify the consumer that message is produced
    }

    // Consumer method
    public synchronized void consume() throws InterruptedException {
        while (!isProduced) {
            wait();  // Wait if no message is produced
        }
        System.out.println("Consumed message");
        isProduced = false;
        notify();  // Notify the producer to produce another message
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Producer thread
        Thread producer = new Thread(() -> {
            try {
                sharedResource.produce();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                sharedResource.consume();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}

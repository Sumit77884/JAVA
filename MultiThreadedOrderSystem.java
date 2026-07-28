class OrderProcessor extends Thread {
    static int orderId = 0;
    static final Object lock = new Object();
    final String customerName;

    OrderProcessor(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void run() {
        synchronized (lock) {
            orderId++;
            System.out.println(getName() + " is processing order " + orderId + " for " + customerName);
            try {
                sleep(100); // Simulate order processing time
            } catch (InterruptedException e) {
                interrupt();
            }
        }
    }
}

public class MultiThreadedOrderSystem {
    public static void main(String[] args) {
        String[] customers = {"Alice", "Bob", "Charlie", "Diana", "Edward"};
        for (String customer : customers) {
            OrderProcessor processor = new OrderProcessor(customer);
            processor.start();
        }
    }
}

package Y1S2.lab3;

public class Zoo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread gate1 = new Thread(new Gate(counter, 250000));
        Thread gate2 = new Thread(new Gate(counter, 500000));
        Thread gate3 = new Thread(new Gate(counter, 750000));

        gate1.start();
        gate2.start();
        gate3.start();

        gate1.join();
        gate2.join();
        gate3.join();

        System.out.println("Expected : " + 1500000);
        System.out.println("Actual: " + counter.getCounter());
    }
}

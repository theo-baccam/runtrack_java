package job05;


public class Counter extends Thread {
    int startingNumber;
    int endNumber;

    public Counter(int startingNumber, int endNumber) {
        this.startingNumber = startingNumber;
        this.endNumber = endNumber;
    }

    @Override
    public void run() {
        for (
            this.startingNumber = this.startingNumber;
            this.startingNumber < this.endNumber;
            this.startingNumber++
        ) {};
    }
}
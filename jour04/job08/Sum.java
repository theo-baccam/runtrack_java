package job08;


public class Sum extends Thread {
    int startNum;
    int endNum;
    long sum = 0;

    public Sum(int startNum, int endNum) {
        this.startNum = startNum;
        this.endNum = endNum;
    }

    @Override
    public void run() {
        for (int i = this.startNum; i <= endNum; i++) {
            this.sum += i;
        };
    }
}
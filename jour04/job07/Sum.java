package job07;


public class Sum extends Thread {
    int[] integerArray;
    int startIndex;
    int endIndex;
    int sum = 0;

    public Sum(int[] integerArray, int startIndex, int endIndex) {
        this.integerArray = integerArray;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        for (int i = this.startIndex; i < endIndex; i++) {
            this.sum += this.integerArray[i];
        };
    }
}
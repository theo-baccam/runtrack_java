package job08;


public class Job08 {
    private static final int NUMBER_OF_THREADS = 100;

    public static void main(String[] arg) {
        Sum[] sumThreadArray = new Sum[NUMBER_OF_THREADS];

        long startTime = System.nanoTime();

        for (int i = 0; i < NUMBER_OF_THREADS; i++) {
            int startNum = (10000000 / NUMBER_OF_THREADS) * i + 1;
            int endNum = (10000000 / NUMBER_OF_THREADS) * (i + 1);
            Sum s = new Sum(startNum, endNum);
            sumThreadArray[i] = s;
            s.start();
        };

        for (Sum s : sumThreadArray) {
            try {
                s.join();
            } catch (InterruptedException e) {};
        };

        long totalSum = 0;
        for (Sum s : sumThreadArray) {
            totalSum += s.sum;
        }

        long endTime = System.nanoTime();
        System.out.printf(
            "The sum of 1 to 10 Million is %d, it took %.2f ms to calculate%n",
            totalSum, (float) (endTime - startTime) / 1000000
        );
    }
}
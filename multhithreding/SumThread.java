package test.multhithreding;

public class SumThread  implements  Runnable{

    int threadInterval;

    public SumThread(int threadInterval) {
        this.threadInterval = threadInterval;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            long sum = sum(this.threadInterval);
            System.out.println(sum);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public long sum(int interval) {
        long sum = 0;

        for (int i = 0; i <= interval; i++) {
            sum += i;
        }

        return sum;
    }
}

package test.multhithreding;

public class SubstractionThread implements Runnable {

    int threadInterval;

    public SubstractionThread(int threadInterval) {
        this.threadInterval = threadInterval;

    }



    @Override
    public void run() {
        try {
            Thread.sleep(1);
            long substraction =subtraction(this.threadInterval);
            //System.out.println(substraction);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public long subtraction(int interval) {
        long sum = 0;

        for (int i = 0; i <= interval; i++) {
            sum -= i;

        }

        return sum;
    }
}

package test.multhithreding;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Intro {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(10);

        Thread sum = new Thread(new SubstractionThread(10));
        Thread substraction = new Thread(new SumThread(10));

        System.out.println("Start new threads");


        long start1 = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
          //  subtraction(i);
         //  sum(i);
            //System.out.println(subtraction(i));
           // System.out.println(sum(i));

        }
        long end1 = System.nanoTime();
        System.out.println(end1-start1 + " END1");

        long start = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            Runnable workerSubstraction = new SubstractionThread(i);
            Runnable workerSum = new SumThread(i);

            executor.execute(workerSubstraction);
            executor.execute(workerSum);

        }
        long end = System.nanoTime();
        System.out.println(end-start + " END");

        executor.shutdown();
        while (!executor.isTerminated()) {
        }

        System.out.println("Finished all threads");


    }

    public static long subtraction(int interval) {
        long sum = 0;

        for (int i = 0; i <= interval; i++) {
            sum -= i;

            sum *= i;
        }



        return sum;
    }

    public static  long sum(int interval) {
        long sum = 0;

        for (int i = 0; i <= interval; i++) {
            sum += i;
        }



        return sum;
    }
}

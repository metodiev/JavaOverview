package test.multhithreding;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Intro {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(10);

        Thread sum = new Thread(new SubstractionThread(10));
        Thread substraction = new Thread(new SumThread(10));

        System.out.println("Start new threads");

        for (int i = 0; i < 100; i++) {
            Runnable workerSubstraction = new SubstractionThread(i);
            Runnable workerSum = new SumThread(i);
            executor.execute(workerSubstraction);
            executor.execute(workerSum);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");

    }
}

package ru.kmetha.oop.homework3.task2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class CounterWithLock implements Runnable {

    private final ReentrantLock lock;
    private static int value = 0;
    private static final int MAX_VALUE = 1000;

    public CounterWithLock(ReentrantLock lock) {
        this.lock = lock;
    }

    public static void main(String[] args) {
        ReentrantLock globalLock = new ReentrantLock();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            executorService.submit(new CounterWithLock(globalLock));
        }
        executorService.shutdown();
    }

    @Override
    public void run() {
        while (value < MAX_VALUE) {
            increment();
        }
    }

    private void increment() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + ": " + value);
            value++;
        } finally {
            lock.unlock();
        }
    }
}

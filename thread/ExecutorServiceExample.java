package com.home.thread;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExecutorServiceExample {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);

        for (int i=0;i<100;i++){
            service.execute(new Task());
        }
        System.out.print("\nThread :"+Thread.currentThread().getName());

    }

    private static class Task implements Runnable {
        @Override
        public void run() {
            System.out.print("\nThread Task:" + Thread.currentThread().getName());

        }
    }
}

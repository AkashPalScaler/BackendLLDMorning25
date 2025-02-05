package org.example.MultithreadedMergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arrToSort = List.of(1, 5, 8, 2, 3, 9, 6, 4);

        ExecutorService es = Executors.newCachedThreadPool();

        Sorter sorter = new Sorter(arrToSort, es);

        Future<List<Integer>> sortedArrFuture = es.submit(sorter);

        List<Integer> sortedArr =  sortedArrFuture.get();

        System.out.println("Sorted Array :" + sortedArr.toString());


    }
}

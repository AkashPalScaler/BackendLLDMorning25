package org.example.MultithreadedMergeSort;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    List<Integer> arrToSort;
    ExecutorService es;

    public Sorter(List<Integer> arrToSort, ExecutorService es){
        this.arrToSort = arrToSort;
        this.es = es;
    }


    @Override
    public List<Integer> call() throws Exception {
        if(this.arrToSort.size() == 1){
            System.out.println("DEBUG");
            return this.arrToSort;
        }
        int size = this.arrToSort.size();
        int mid = size/2;

        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for(int i=0;i<mid;i++){
            leftArray.add(arrToSort.get(i));
        }

        for(int i=mid;i<size;i++){
            rightArray.add(arrToSort.get(i));
        }

        Sorter leftSorter = new Sorter(leftArray, es);
        Sorter rightSorter = new Sorter(rightArray, es);

//        ExecutorService es = Executors.newCachedThreadPool();

        Future<List<Integer>> leftSortedArrFuture = es.submit(leftSorter);
        Future<List<Integer>> rightSortedArrFuture  = es.submit(rightSorter);
        //leftSorter -------------------10s>
        //rightSorter ----------------9ss>


        List<Integer> sortedLeftArray = leftSortedArrFuture.get(); //10secs
        List<Integer> sortedRightArray = rightSortedArrFuture.get();

        //11 secs


        //merge of two sorted arrays

        int i= 0; // start of left
        int j = 0; //start of right

        List<Integer> sortedArray = new ArrayList();

        while (i < sortedLeftArray.size() && j < sortedRightArray.size()) {
            if (sortedLeftArray.get(i) <= sortedRightArray.get(j)) {
                sortedArray.add(sortedLeftArray.get(i));
                i += 1;
            } else {
                sortedArray.add(sortedRightArray.get(j));
                j += 1;
            }
        }

        while (i < sortedLeftArray.size()) {
            sortedArray.add(sortedLeftArray.get(i));
            i += 1;
        }

        while (j < sortedRightArray.size()) {
            sortedArray.add(sortedRightArray.get(j));
            j += 1;
        }
        return sortedArray;

    }
}

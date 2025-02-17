package org.example.Lamda;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public class Client {
    public static void main(String[] args) {

        Runnable task = new HelloWorldPrinter();
        Thread t = new Thread(task);
        t.start();

        Callable<Integer> task3 = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 0;
            }
        };

        Thread t2 = new Thread(task);
        t2.start();
        // class Somehting implement Sing{
//        @Override
//        public void singsong() {
//            System.out.println("Singing song");
//        }
//    }

//        Sing s = new Sing() {
//            @Override
//            public void singsong() {
//                System.out.println("Singing song");
//            }
//
//            @Override
//            public void display(){
//                System.out.println("Some diplay");
//            }
//        };
        //Anonymous Class
        // We are creating object of an anonymous class which implements Runnable
        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
                //multilibne
            }
        };
        // Lambda functions: (//inputs to function) -> { // function body}
        Runnable task4 = () -> { //This is the run()
            System.out.println("Hello World");
            //multiline
        };
        //lambda fucntion
        Runnable task5 = () -> { //This is the run()
            System.out.println("Hello World Printing");
            //multiline
        };

        Callable<Integer> task6 = () ->{ // Call
            return 6;
        };

        Sing s2 = (v, w) -> {
            System.out.println("V :"+ v);
            System.out.println("hello");
            return 7;
        };

        // One line statement
//        Sing s3 = (v, w) -> System.out.println("How");

        // Return in one line
        Sing s3 = (v, w) -> v+w;


        s3.singsong(5, 7);

        List<Integer> nums = List.of(1,2);
        //new Class implements Comparator
        Collections.sort(nums, (o1, o2) -> {
            if(o1 > o2){
                return -1; //-ve
            }else if(o1< o2){
                return 1; //+ve
            }
            return 0;
        });

        Collections.sort(nums, (o1, o2) -> o2-o1);

        System.out.println("DEBUG");
    }
}

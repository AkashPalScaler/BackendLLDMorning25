package org.example.Collections;

import com.sun.source.tree.ArrayAccessTree;
import com.sun.source.tree.Tree;

import java.security.cert.CollectionCertStoreParameters;
import java.util.*;

public class Client {
    public static void main(String[] args) {
//        Collection
        // Can have duplicates
        // Can be ordered or unordered
        // Is iterable
        // List, Queue, Set

        //List
        // ArrayList
        // Duplicates allowed and Ordered(Insertion order)
        // It allows random access: O(1)
        // Insert : O(1) [Amortized time constant]
        // Growable/Resizable
        // Not synchronized
        List<Integer> list1 = new ArrayList<>();

        // Doubly linked list
        // Random Access: O(n)
        // Insertion in the start and end O(1) and deletion O(n), are easier
        //Not Synchronized
        List<Integer> list2 = new LinkedList<>();

        // ArrayList + Synchronized
        // Synchronization causes vector to be inefficient
        List<Integer> list3 = new Vector<>();

        // Vector + LIFO
        // Synchronized
        List<Integer> list4 = new Stack<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(1);

        //Non synchronized stack
        List<Integer> list5 = new LinkedList<>(); // Can be used as stack


        // Queue
        // Heap Array
        // Natural sorted order
        Queue<Integer> q1 = new PriorityQueue<>();
        q1.add(5);
        q1.add(3);
        q1.add(20);
        q1.add(10);
        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.poll();
        }
        System.out.println("*****");
        //User linked list
        // Insertion order
        Queue<Integer> q2 = new LinkedList<>();
        q2.add(5);
        q2.add(3);
        q2.add(20);
        q2.add(10);
        while(!q2.isEmpty()){
            System.out.println(q2.peek());
            q2.poll();
        }
        System.out.println("*****");
        // Uses arrays
        // Insertion order
        Queue<Integer> q3 = new ArrayDeque<>();
        q3.add(5);
        q3.add(3);
        q3.add(20);
        q3.add(10);
        while(!q3.isEmpty()){
            System.out.println(q3.peek());
            q3.poll();
        }

        // Sets
        // No duplicate elements

        // Uses HashMap, only keys as it's element
        // Random Ordered or Unordered
        Set<Integer> s1 = new HashSet<>();
        s1.add(5);
        s1.add(3);
        s1.add(20);
        s1.add(10);

        System.out.println(s1);
        // DLL + Hashmap
        // Insertion order
        Set<Integer> s2 = new LinkedHashSet<>();
        s2.add(5);
        s2.add(3);
        s2.add(20);
        s2.add(10);
        System.out.println(s2);
        // TreeMap : Balance BST : Red Black Tree
        Set<Integer> s3 = new TreeSet<>();
        s3.add(5);
        s3.add(3);
        s3.add(20);
        s3.add(10);
        System.out.println(s3);

        //Maps
        //HashMap
        // Keys are Random Ordered or Unordered
        Map<Integer, Integer> map1 = new HashMap<>();
        // DLL + Hashmap
        // Keys are following Insertion order
        Map<Integer, Integer> map2 = new LinkedHashMap<>();
        // TreeMap : Balance BST : Red Black Tree
        // Natural sorted order of keys
        Map<Integer, Integer> map3 = new TreeMap<>();

        Map<Integer, Integer> map4 = new Hashtable<>();

        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(5);
        nums.add(1);
        nums.add(3);

        Collections.sort(nums);

        System.out.println("Sorted list nums : " + nums);

        Student st1 = new Student("Karthick", 26, 1.5f);
        Student st2 = new Student("Akash", 29, 0.5f);
        Student st3 = new Student("Greeshwar", 23, 2.5f);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);



        Collections.sort(students); // st1.compareTo(s2) | compare(s1,s2)
        System.out.println("Students sorted by Natural order(age) :");
        for(Student student : students){
            System.out.println(student.name);
        }
        System.out.println("Students sorted by psp :");
        Collections.sort(students, new StudentPSPComparator());
        for(Student student : students){
            System.out.println(student.name);
        }


    }
}

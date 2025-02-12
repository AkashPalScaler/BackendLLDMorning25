package org.example.Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Client {
    public static void main(String[] args) {
//        Pair.something("first", 5);
//        Pair<String, Integer> studentMarks = new Pair<>();
//        studentMarks.setFirst("Akash");
//        studentMarks.setSecond(96);
//
//        System.out.println("Student " + studentMarks.getFirst() + " : " + studentMarks.getSecond());
//
//        Pair<Double, Double> coordinate = new Pair<>();
//
//        coordinate.setFirst(1.6);
//        coordinate.setSecond(2.8);
//
//        System.out.println("Coordinates : " + coordinate.getFirst() + ", " + coordinate.getSecond() );
//
//
//        Pair<String, String> name = new Pair<>("Manoj", "kumar");
//        System.out.println(name.getFirst() + " " + name.getSecond());
//
//        Pair p1 = new Pair();
//        p1.first = "Akash";
//        p1.first = 4.0;
//
//        HashMap hm = new HashMap();
//        hm.put(1, "Akash");

        List<Animal> animals = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();

        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Dog());

        dogs.add(new Dog());
        dogs.add(new Dog());

        List<Integer> numbers = List.of(1,23,34);

//        Utility.doSomething(numbers);
        Utility.doSomething(animals, new Dog());
        Utility.doSomething(dogs, new Dog());


//        animals = dogs;

    }
}

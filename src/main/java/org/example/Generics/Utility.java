package org.example.Generics;

import java.util.List;

public class Utility {
    public static void doSomething2(List<? extends Animal> animals){
        animals.get(0).displayName();
//        T animal = animals.get(0);
//        animals.add(animals.get(0)); //Wildcards don't allow modifications at all
    }
    public static <T extends Animal> void doSomething(List<T> animals, T animal){
        animals.get(0).displayName();
//        T animal = animals.get(0);
        animals.add(animal);
    }
}

package org.example.Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Runner dog = new Dog();
        Runner robotDog = new RoboticDog();

        System.out.println(dog.x);
        System.out.println(robotDog.x);

        List<Runner> runners = new ArrayList<>();

        runners.add(dog);
        runners.add(robotDog);

        //Start a race
        for(Runner runner: runners){
            runner.run(); // runtime error -> run() doesn't exist

//          runner.bark(); // Interface reference can only call interface methods
        }


        List<Animal> animals = new ArrayList<>();
        Animal a = new Dog();
        Animal b = new Horse();

        animals.add(a);
        animals.add(b);

        for(Animal animal: animals){
            animal.move();
        }


        Runner.check();
        Dog.check();

//        Runner d = new Dog();



    }
}

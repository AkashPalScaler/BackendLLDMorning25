package org.example.SOLIDBird.V0;

public class Bird {
    String name;
    Float weight;
    String color;
    String type;

    void fly(){
        //Violation of SRP and OCP
        if(type == "Pigeon"){
            System.out.println(name + " is low flying");
        } else if (type == "Crow") {
            System.out.println(name + " is high flying");
        }
    }
    void eat(){
        System.out.println(name + " is eating");
    }
    void makeSound(){
        System.out.println(name + " is making sound");
    }
}

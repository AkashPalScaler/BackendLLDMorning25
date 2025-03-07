package org.example.DesignPatterns.PrototypeAndRegistry;

public class Client2 {
    public static void main(String[] args) {
//        Student s = new Student("Akash", 29);
//        IntelligentStudent is = new IntelligentStudent("Akash", 29, 100, 1);
//
//        //FILL REGISTRY
//        StudentRegistry<Student> registry = new StudentRegistry();
//        registry.register("Student", s);
////        registry.register("IntelliStudent", is);


        //Creating copies

        StudentRegistry registry = StudentRegistry.getInstance();

        Student scopy = registry.get("Student").copy();
        Student iscopy = registry.get("IntelliStudent");


        System.out.println("DEBUG");

    }
}

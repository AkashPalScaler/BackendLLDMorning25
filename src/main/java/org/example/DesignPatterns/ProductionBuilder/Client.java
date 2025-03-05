package org.example.DesignPatterns.ProductionBuilder;

public class Client {
    public static void main(String[] args) {
        // Version 3
        Student s1 = Student.getBuilder()
                .setAge(18)
                .setName("Akash")
                .setEmail("aksgh.pal95@gmail.com")
                .build();

        System.out.println("DEBUG");

    }
}

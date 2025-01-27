package org.example.Constructors;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student();

        Student s2 = new Student("Akash", 12);
        System.out.println("Debug");

        Student s3 = new Student("Akash", 12, 2025);


        Student s3Copy = s3; // No new object

        s3Copy.name = "Changed";

        Student s2Copy = new Student(s2);

        System.out.println(s3.name);

        Student.displayCount();



        System.out.println("Debug");
    }
}

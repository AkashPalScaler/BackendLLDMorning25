package org.example.Constructors;

import javax.xml.stream.XMLEventWriter;

public class Student {
    //Attribute
    String name;
    int id;
    private int age;
    private int gradYear;
    Exam exam;

    public static int countOfStudent = 0;


    // Non-static/ instance variables and functions can not be called from
    // static functions

    //But static variables and functions can be called from non-static
    public static void displayCount(){
//        System.out.println("Namew :"+ name);
        System.out.println("Number of student obj :" + countOfStudent);
    }

    public String getName() {
        return name;
    }

    public Student(){
        name = "Temp_name";
        id = 0;
        age = 10;
        gradYear = 2020;
        exam = new Exam();
        countOfStudent++;
    }

    public Student(String name, int id){
        System.out.println("Debug");
        this.name = name;
        this.id = id;
        exam = new Exam("123", 100);
        countOfStudent++;
    }

    public Student(String name, int id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
        exam = new Exam("123", 100);
        countOfStudent++;
    }

    public Student(Student s){
        this.name = s.name; // s.getName() or s.name | You can use getters also
        this.age = s.age;
        this.id = s.id;
        this.gradYear = s.gradYear;
        this.exam = new Exam(s.exam);
        countOfStudent++;

//        this.exam = new Exam();
//        this.exam.id = s.exam.id;
//        this.exam.score = s.exam.score;
    }

}

package org.example.DesignPatterns.Builder;

public class Student {
    String name;
    int age;
    float psp;
    String email;

    Student(StudentBuilder sb){
        if(sb.email == null || sb.email == ""){
            throw new RuntimeException("Email can't be empty");
        }
        // Other validations
        if(sb.age < 18){
            throw new RuntimeException("Students must be above 18");
        }
        this.name = sb.name;
        this.age = sb.age;
        this.psp = sb.psp;
        this.email = sb.email;
    }

    static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }
}

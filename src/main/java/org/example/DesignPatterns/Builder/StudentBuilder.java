package org.example.DesignPatterns.Builder;

public class StudentBuilder {
    String name;
    int age;
    float psp;
    String email;

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setPsp(float psp) {
        this.psp = psp;
        return this;
    }

    public StudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Student build(){
        return new Student(this);     //this is the caller object the function

    }
}

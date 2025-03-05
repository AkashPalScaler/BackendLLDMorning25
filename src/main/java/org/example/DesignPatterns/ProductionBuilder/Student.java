package org.example.DesignPatterns.ProductionBuilder;

public class Student {
    String name;
    int age;
    float psp;
    String email;

    private Student(StudentBuilder sb){
        this.name = sb.name;
        this.age = sb.age;
        this.psp = sb.psp;
        this.email = sb.email;
    }

    static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    static class StudentBuilder {
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
            if(this.email == null || this.email == ""){
                throw new RuntimeException("Email can't be empty");
            }
            // Other validations
            if(this.age < 18){
                throw new RuntimeException("Students must be above 18");
            }
            return new Student(this);     //this is the caller object the function

        }
    }
}

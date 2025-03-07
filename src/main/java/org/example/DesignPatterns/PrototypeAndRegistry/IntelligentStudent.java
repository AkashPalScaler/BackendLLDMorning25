package org.example.DesignPatterns.PrototypeAndRegistry;

import javax.xml.stream.events.StartDocument;

public class IntelligentStudent extends Student{
    float  iq;
    int psp;

    public IntelligentStudent(String name, int age, float iq, int psp) {
        super(name, age);
        this.iq = iq;
        this.psp = psp;
    }

    public IntelligentStudent(IntelligentStudent s){
        super(s);
        this.iq = s.iq;
        this.psp = s.psp;
    }

    public IntelligentStudent copy(){
        System.out.println("Intelligent student copy called");
        return new IntelligentStudent(this);
    }
}

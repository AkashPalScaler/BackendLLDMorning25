package org.example.DesignPatterns.PrototypeAndRegistry;

import java.util.HashMap;

public class StudentRegistry {
    private HashMap<String, Student> registry;
    private static StudentRegistry instance = null;

    public static StudentRegistry getInstance(){
        if(instance == null){
            synchronized (StudentRegistry.class){
                if(instance == null){
                    instance = new StudentRegistry();
                }
            }
        }
        return  instance;
    }

    private StudentRegistry() {
        this.registry = new HashMap<>();
        //Read this student values from internal env library
        Student s = new Student("Akash", 29);
        IntelligentStudent is = new IntelligentStudent("Akash", 29, 100, 1);

        this.register("Student", s);
        this.register("IntelliStudent", is);
    }

    private void register(String key, Student s){
        registry.put(key, s);
    }

    public Student get(String key){
        return registry.get(key);
    }
}

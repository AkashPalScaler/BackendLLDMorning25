package org.example.AccessModifiers;

import org.example.IntroToOOPs.BankAccount;
import org.example.Inheritance.Student;

public class Client extends Student {
    //properties of student comes here
    // protected gradYear// assumes it here
    public void doSomething(){
//        this.name = "Akash";
//        this.age = 10;
//        this.id = 1;
        this.gradYear = 2002; // Protected members can be accessed from child class
    }
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

//        bankAccount.balance = 0.0; // can't use private
//        bankAccount.ownerName = "Akash"; // public
//        bankAccount.age = 10; // default
//
        Student s = new Student();
        s.name = "Akash";
//        s.age = 10;
//        s.id = 1;
//        s.gradYear = 2002; //Even if class is child class, we can't access protected through an object
//
        Client c = new Client();
        c.gradYear = 1000; // Protected members can be accessed by child class objects

        bankAccount.deposit(100.0);
    }
}

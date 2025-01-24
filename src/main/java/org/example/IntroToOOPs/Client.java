package org.example.IntroToOOPs;


public class Client {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.name = "Manish";
        student1.setAge(12);
        student1.id = 1;
        student1.gradYear = 2024;
//
//        Student student2 = new Student();
//
//        student1.name = "Pallavi";
//        student1.age = 26;
//        student1.id = 2;
//        student1.gradYear = 2025;
//
//        student1.rateClass(12);

        BankAccount bankAccount = new BankAccount();

        bankAccount.setBalance(0.0); // can't use private
        bankAccount.setOwnerName("Akash"); // public

        bankAccount.deposit(100.0);
        bankAccount.withdraw(10.0);
        bankAccount.withdraw(50.0);
        bankAccount.deposit(10000.0);

        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount("Akash", 100.0);


        System.out.println(bankAccount.getOwnerName() + " has a balance of " + bankAccount.getBalance());
        System.out.println("Bank statement : ");
        bankAccount.printTransactionLogs();
    }
}

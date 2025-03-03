package org.example.DesignPatterns.Singleton;

public class Client {
    public static void main(String[] args) {
        DBConnection db1 = DBConnection.getInstance("http://dbconn:8000", "password");
        DBConnection db2 = DBConnection.getInstance("http://dbconn:8000", "password");
        DBConnection db3 = DBConnection.getInstance("http://dbconn:8000", "password");

        System.out.println("DEBUG");
    }
}

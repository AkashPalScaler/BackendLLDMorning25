package org.example.DesignPatterns.Singleton;

import java.util.concurrent.locks.ReentrantLock;

public class DBConnection {
    String url;
    String password;
//    MySQLConn msconn1, msconn2;
    // String filepathA, filePathB;
    private static DBConnection instance = null;
//    static ReentrantLock lock = new ReentrantLock(); // We can use this too, try it out!
    private DBConnection(String url, String password){
        this.url = url;
        this.password = password;
        //Connection1 msconn1 = MYSQLConnection(filepathA);
        //Connection2 msconn2 = MYSQLConnection(filepathB);
    }

    static DBConnection getInstance(String url, String password){
        if(instance == null){
            synchronized (DBConnection.class){ //lock()
                if(instance == null){
                    instance = new DBConnection(url, password);
                }
            } // unlock()
        }
        return instance;
    }

//    logToFileA(){
//        //connection1
//            msconn1.query();
//    }
//    logToFileB(){
//        //connection2
//        msconn2.query();
//    }

//    executeQuery(){
//        msconn1.query();
//        msconn2.query();
//    }

}

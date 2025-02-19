package org.example.Exceptions;

import java.sql.SQLException;

public class Util {
    public static void demo(int a) throws SQLException{
            try {
                int x = 10 / a; //ArithmeticException on 0
                if (a == 5) {
                    throw new SQLException("SQL Exception message");
                }
            }
            catch(ArithmeticException e){
                System.out.println("Arithmetic Error :"+ e.getMessage());
                //something specific
                throw e;
            }
            catch(RuntimeException e){
                System.out.println("Getting exception");
            }
            catch(SQLException e){
                System.out.println("SQL Error " + e.getMessage());
                //retry logic
                // db.query()
                throw e;
            }
            catch(Exception e){
                System.out.println("Internal Server error :" + e.getMessage());
            }


    }
}

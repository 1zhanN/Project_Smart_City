/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqlconnector;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class MySqlConnector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String className = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(className);
            System.out.println("Driver found");

        } catch (ClassNotFoundException ex) {
             System.out.println("Driver not found");

            System.out.println(ex.getMessage());
        }
    }
    
    
}

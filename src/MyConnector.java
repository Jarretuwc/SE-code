/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jarret
 */
public class MyConnector {
    Connection con;
    //Establishes the connection to the Database and allows it to be called when needed in the other classes
    public MyConnector(){
        try {
            con = DriverManager.getConnection ("jdbc:ucanaccess://BuiltDifferent_DB3.accdb;memory=true");
        } catch (SQLException ex) {
            Logger.getLogger(MyConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
        Connection connectionMaker(){
        return con;
    }
}

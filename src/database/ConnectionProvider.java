/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;
/**
 *
 * @author lahiru sandaruwan
 */
public class ConnectionProvider {
    
    public static Connection getCon(){
    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TextileManagmentSystem","root","Lahiru@718991994");
            return con;
        }
        catch(Exception e)
        {
        return null;
                }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;
import java.sql.*;

/**
 *
 * @author pathm
 */
public class db_connection {
    static Connection con;
    
    public static Connection getcon(){
        try{
             Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/college_10","root","admin");
            
        }
        catch(Exception e){
            System.out.println(e+"error occure in database connectivity");
           
            
        }
        return con;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.register_bean;
import DB.db_connection;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import static java.time.Clock.system;
import java.util.*;
/**
 *
 * @author pathm
 */
public class register_dao {
    static Connection co;
    static Statement stm;
    static ResultSet rs;
    static String pass,username,name,address,mobileno;
    register_bean bean=new register_bean();
    
    
    public void register_db(){
        
        pass=bean.getPassword();
        username=bean.getUsername();
        name=bean.getName();
        address=bean.getAddress();
        mobileno=bean.getMobileno();
      //  field=bean.getField();
        
        
        try {
            co=db_connection.getcon();
            stm=co.createStatement();
           // System.out.println("connected sucessfully    name:"+name);
             //System.out.println("connected sucessfully");
            String query_1="INSERT INTO employee_info VALUES('"+name+"','"+username+"','"+pass+"','"+mobileno+"','"+address+"')";
           //  System.out.println(query_1);
           String query_2="INSERT INTO info_1 VALUES('"+username+"','"+pass+"')";
          //  System.out.println(query_2);
            stm.execute(query_1);
         //   System.out.println("query_1");
            
            stm.execute(query_2);
          // System.out.println("query_2");
            
            co.close();
        }
        catch(Exception e){
            System.out.println(e+"\n  erro will occure in register dao exceptioin");
            
        }
        
    }
    
}

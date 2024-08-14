/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.login_bean;
import DB.db_connection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.util.*;

/**
 *
 * @author pathm
 */
public class login_dao {
  //  db_connection db=new db_connection();
    
   login_bean lb=new login_bean();
    static Connection co;
         static PreparedStatement stm;
   
   // static Statement stm;
         static ResultSet rs;
         
         static int count;
         
         //System.out.println("fdsd");
    
    public void login_db(){
         String username=lb.getUsername();
         String password=lb.getPassword();
       // System.out.println("u_name: "+username);
       // System.out.println("password :"+password);
        
         
        try{
    co=db_connection.getcon();
            
   // System.out.println("connceted sucessfully");
    
    

    String query_1="SELECT * from info_1 where Username='"+username+"' and Password='"+password+"'  ";
   // System.out.println("new     "+query_1);
    //System
      stm=co.prepareStatement(query_1);
  //  stm=co.prepareStatement("SELECT * from info_1 where Username='"+username+"' and Password='"+password+"'  ");
  //  System.out.println("second  "+query_1);
   // stm.executeUpdate(query_1);
   rs= stm.executeQuery();
    count=0;
    
    while(rs.next()){
        count++;
    }
  //  System.out.println("count is:"+count);
    co.close();
        
    }
    
catch(Exception e){
    System.out.println(e+"    sfdsdfsdfs");
    
    }
        //return 0;
        
    
}
    public int count(){
            return count;
        }
}

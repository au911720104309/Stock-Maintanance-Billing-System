/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

//import Beans.product_update_bean;
import Beans.stock_update_bean;
import Beans.user_login_info;
import static DAO.register_dao.name;
import DB.db_connection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import stock_management.main;

/**
 *
 * @author pathm
 */
public class stock_update_dao {
    static Connection con;
    static Statement stm;
     String name,sno,hsnno,quantity,model,prize,field,user;
    // static public DefaultTableModel t=new DefaultTableModel(0,0);
    // String data[];
     
                 
    static ResultSet rs;
    main a=new main();
  // main up=new main();
    stock_update_bean up=new stock_update_bean();
    private Object show_table;
   // private Object DbUtils;
    public void stock_db(){
    name=up.getProductname();
                 //sno=up.getSno();
                 model=up.getModel();
                 sno=up.getSno();
               
                 prize=up.getPrize();
                 hsnno=up.getHsnno();
                 quantity=up.getQuantity();
                 field=stock_update_bean.getField();
                 user=user_login_info.getUsername();
    
       
        
        try{
         
                 
        con=db_connection.getcon();
       // System.out.println(quantity +" is the quantity form dao");
        
        String query="INSERT INTO item_info(product_name,model,serial_no,hsn_no,prize,field,updated_by) VALUES('"+name+"','"+model+"','"+sno+"','"+hsnno+"','"+prize+"','"+field+"','"+user+"')";
       // String query="INSERT INTO item_info(model) VALUES('"+model+"')";
        
      //  System.out.println(query);
        stm=con.createStatement();
        stm.executeUpdate(query);
        con.close();
        
                }
        catch(Exception e){
            System.out.println(e+" this is exception form stock_update_dao");
        }
        }
     
  
        
        }
   
        
    

    
   // @SuppressWarnings("empty-statement")
   
        
        
    
    


    
    
    
    
    


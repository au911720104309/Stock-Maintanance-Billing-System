/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.fullstock_db_bean;
import Beans.stock_db_bean;
import Beans.stock_update_bean;
import static DAO.stock_update_dao.con;
import DB.db_connection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import stock_management.main;

/**
 *
 * @author pathm
 */
public class stock_quantity_dao {
     Connection con;
     Statement stm;
    //   stock_update_bean up=new stock_update_bean();
    // String name,sno,hsnno,quantity,model,prize,field,user;
     String query2,query3;
   //  fullstock_db_bean fs_bean=new fullstock_db_bean();
     stock_db_bean up=new stock_db_bean();
     stock_update_bean s_update=new stock_update_bean();
     
    // String n=fs_bean.getProductname() 
    // String n=s_bean.getPr_name();
 //    String quan=s_bean.getPr_quantity();
    // quantiy_get_dao quant=new quantiy_get_dao();
     String d_name=null,d_model=null,quantity=null,d_quan=null,name=null,model=null,field=null;
     
     
  
    public void no_of_stock(){
        
       // quant.get_detail();
        
       
          d_name=up.getPr_name();
              d_model=up.getPr_model();
              d_quan=up.getPr_quantity();
              name=s_update.getProductname();
              model=s_update.getModel();
              quantity=s_update.getQuantity();
              field=s_update.getField();
             // System.out.println(d_model+" this name form stock_count_info");
            //  System.out.println(model+" this name form stock_count_info");
            //m=new main();
            
            
          //  System.out.println(p_name);
              
             
            
     if(d_name == null && d_model== null )
         {
        
       
                
        try{
            
                      
        con=db_connection.getcon();
   //     System.out.println("execute from no_of_stock()\n name is: "+name+"and n is:"+n);
        
  
          
          
             System.out.println("from else");
          
          query2="INSERT INTO stock_count_info(product_name,model,quantity,field) VALUES('"+name+"','"+model+"','"+quantity+"','"+field+"')";
          System.out.println(query2+ "this quer from stock_quantity_dao else" );
         stm=con.createStatement();
         
         stm.execute(query2);
         con.close();
  
     //    if(name.equals(d_name)){
          
         
         //  System.out.println(query3);
         //  con.close();
        }
        catch(Exception e){
            
            System.out.println(e+" this is exception form no_of_stock() in query 2");
            
        }
         }
         
        else{
         try{
             con=db_connection.getcon();
              int quanti=Integer.parseInt(d_quan);
              int quantity_int=Integer.parseInt(quantity);
                quanti+=quantity_int;
          d_quan=String.valueOf(quanti);
          query3="UPDATE stock_count_info SET quantity='"+d_quan+"' WHERE product_name='"+name+"' ";
           stm=con.createStatement();
           System.out.println(query3+"this is the quer form stock_quantity_dao");
           stm.executeUpdate(query3);
           con.close();
         }
         catch(Exception e){
            
            System.out.println(e+" this is exception form no_of_stock() in query 3");
            
        }
          
            
          
        // System.out.println(query2);
     //    stm.executeQuery(query2);
              
          
       // String query="INSERT INTO item_info(model) VALUES('"+model+"')";
        
      // System.out.println(query2);
       
          //System.out.println(query2);
        // System.out.println(query3);
      //  stm.executeUpdate(query);
        
        }
         
        
        
          
             
            
    }
    }

    

    


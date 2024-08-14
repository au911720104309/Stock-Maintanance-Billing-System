/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.stock_db_bean;
import Beans.stock_delete_bean;
import DB.db_connection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author pathm
 */
public class stock_delete_dao {
    stock_delete_bean d_bean=new stock_delete_bean();
    String name=d_bean.getName(),model=d_bean.getModel(),quantity_in_db=d_bean.getQuantity_from_db();
   //  int quantity=(Integer.parseInt(quantity_in_db))-1;
    stock_db_bean sd_dao=new stock_db_bean();
    
    String quantity=sd_dao.getPr_quantity();
    int quant=Integer.parseInt(quantity);
    
    
   
    
    
    
    public void stock_delete(){
         Statement stm;
         Connection con;
        try{
            
            
         con =db_connection.getcon();
            String query="DELETE FROM item_info WHERE product_name='"+name+"'and model='"+model+"' ";
             String query1="DELETE FROM stock_count_info WHERE product_name='"+name+"'and model='"+model+"' ";
        System.out.println(query +"this query from stock delete dao");
        stm=con.createStatement();
        stm.execute(query);
        stm.execute(query1);
        System.out.println(query +"this query from stock delete dao");
        quant=quant-1;
        String query2="UPDATE stock_count_info SET quantity='"+quant+"'";
        
 //       String query2="UPDATE stock_count_info SET quantity='"+quantity+"' WHERE product_name='"+name+"' ";
       // stm.execute(query2);
       // System.out.println(query2 +"this query from stock delete dao");
        con.close();
        
            
        }
        
        catch(Exception e){
            System.out.println(e+" this is the exception form the stock_delete_dao");
        }
    }
    
        
    
}

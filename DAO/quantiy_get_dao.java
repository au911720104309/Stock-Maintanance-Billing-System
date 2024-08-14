/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.stock_db_bean;
import Beans.stock_delete_bean;
import Beans.stock_update_bean;
import DB.db_connection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author pathm
 */
public class quantiy_get_dao {
     stock_db_bean s_bean=new stock_db_bean();
     String pr_name = null,pr_model = null,pr_quantity = null,name=null,model=null,gst;
     stock_delete_bean sd_bean=new stock_delete_bean();
      stock_update_bean sto_bean=new stock_update_bean();
    public void get_detail(){
        
       
       name= sto_bean.getProductname();
       model=sto_bean.getModel();
        
       

    

    try{
     //   ArrayList<String>
       Connection con =db_connection.getcon();
      
            String query="SELECT stock_count_info.product_name,stock_count_info.model,stock_count_info.quantity,item_info.hsn_no FROM  stock_count_info,item_info WHERE stock_count_info.product_name='"+name+"'AND stock_count_info.model='"+model+"' AND item_info.product_name='"+name+"'AND item_info.model='"+model+"' ";
       System.out.println(query +"this query from quantity_get_dao");
       Statement stm=con.createStatement();
        ResultSet rs=stm.executeQuery(query);
      //  System.out.println(query +"this query from quantity_get_dao");
       
       // System.out.println(query);
        
        while(rs.next()){
            
            pr_name=rs.getString("product_name");
            
            pr_model=rs.getString("model");
            pr_quantity=rs.getString("quantity");
            gst=rs.getString("hsn_no");
            
    
}
         
        con.close();
    }
    catch(Exception e){
        System.out.println(e+" this exception comes form quantiy_get_dao");
    
}
    
   // System.out.println("the gst from quantity_get_dao is:"+gst);
     s_bean.setGst(gst);
     s_bean.setPr_name(pr_name);
    s_bean.setPr_model(pr_model);
    s_bean.setPr_quantity(pr_quantity);
    sd_bean.setQuantity_from_db(pr_quantity);
   
    
    
    
    }
   
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.bill_detail_bean;
import DB.db_connection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author pathm
 */
public class gst_get_dao {
    String gst=null,name=null,mode=null,field=null;
    bill_detail_bean bill=new bill_detail_bean();
    Connection con;
    Statement stm;
    ResultSet rs;
  //  bill_detail_bean b_b=new bill_detail_bean();
    public void get_bill_gst(){
        name=bill.getName();
        mode=bill.getModel();
        field=bill.getField();
        
        
        try{
        con=db_connection.getcon();
        stm=con.createStatement();
        String query="SELECT hsn_no FROM item_info WHERE product_name='"+name+"' AND model='"+mode+"' AND field='"+field+"'";
        System.out.println(query +" THIS is from gst_get_dao");
        rs=stm.executeQuery(query);
        while(rs.next()){
            gst=rs.getString("hsn_no");
        }
        bill.setGst(gst);
        
        }
        catch(Exception e){
            System.out.println("this is the exception from gst_get_dao" +e);
        }
        
    }
    
}

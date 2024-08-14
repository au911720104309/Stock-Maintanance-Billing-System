/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author pathm
 */
public class fullstock_db_bean {
    static String productname,model,prize,sno,hsnno,quantity,field;

    public static String getProductname() {
        return productname;
    }

    public static void setProductname(String productname) {
        fullstock_db_bean.productname = productname;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        fullstock_db_bean.model = model;
    }

    public static String getPrize() {
        return prize;
    }

    public static void setPrize(String prize) {
        fullstock_db_bean.prize = prize;
    }

    public static String getSno() {
        return sno;
    }

    public static void setSno(String sno) {
        fullstock_db_bean.sno = sno;
    }

    public static String getHsnno() {
        return hsnno;
    }

    public static void setHsnno(String hsnno) {
        fullstock_db_bean.hsnno = hsnno;
    }

    public static String getQuantity() {
        return quantity;
    }

    public static void setQuantity(String quantity) {
        fullstock_db_bean.quantity = quantity;
    }

    public static String getField() {
        return field;
    }

    public static void setField(String field) {
        fullstock_db_bean.field = field;
    }
    
}

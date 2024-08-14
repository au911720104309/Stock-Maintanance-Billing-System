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
public class stock_delete_bean {
   static String model,prize,sno,hsnno,name,quantity_from_db;

    public String getQuantity_from_db() {
        return quantity_from_db;
    }

    public void setQuantity_from_db(String quantity_from_db) {
        this.quantity_from_db = quantity_from_db;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getHsnno() {
        return hsnno;
    }

    public void setHsnno(String hsnno) {
        this.hsnno = hsnno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

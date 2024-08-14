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
public class stock_db_bean {
    static String pr_name,pr_model,pr_quantity,gst;

    public static String getGst() {
        return gst;
    }

    public static void setGst(String gst) {
        stock_db_bean.gst = gst;
        System.out.println(gst+" gst form stock_db_bean");
    }

    public String getPr_name() {
    //    System.out.println(pr_name+" is the name form stock_db_bean");
        return pr_name;
    }

    public void setPr_name(String pr_name) {
        this.pr_name = pr_name;
    }

    public String getPr_model() {
        return pr_model;
    }

    public void setPr_model(String pr_model) {
        this.pr_model = pr_model;
    }

    public String getPr_quantity() {
        return pr_quantity;
    }

    public void setPr_quantity(String pr_quantity) {
        this.pr_quantity = pr_quantity;
    }
    
}

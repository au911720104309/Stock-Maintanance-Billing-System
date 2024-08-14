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
public class field_get_bean {
    
  static String field,model,productname;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
      //  System.out.println(field+" this field from field_get_bean");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }
    
}

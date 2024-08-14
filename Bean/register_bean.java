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
public class register_bean {
    
    static String username,password,name,mobileno,address;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        register_bean.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        register_bean.password = password;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        register_bean.name = name;
    }

    public static String getMobileno() {
        return mobileno;
    }

    public static void setMobileno(String mobileno) {
        register_bean.mobileno = mobileno;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        register_bean.address = address;
    }

    public String getField() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

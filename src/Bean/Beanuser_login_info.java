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
public class user_login_info {
    static String username,password;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        user_login_info.username = username;
        //System.out.println("the been username is:"+username);
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        user_login_info.password = password;
    }
    
}

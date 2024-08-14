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
public class login_bean {
    
    static String username,password;

    /*
    public void setUsername(String u_name) {
        this.username = u_name;
       System.out.println(username);
 
    }
    public String getUsername() {
       // String name=this.username;
        System.out.println(username);
        
        return username;
    }


    public String getPassword() {
        
        return password;
        
    }
   // System.out.println(username);

    public void setPassword(String p_word) {
        this.password = p_word.toString();
       // System.out.println(username);
        
    }*/

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
       // System.out.println("password is:"+password);
        return password;
    }

    public void setPassword(String a) {
        this.password = a;
    }
    
}

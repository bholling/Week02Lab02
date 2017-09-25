/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

/**
 *
 * @author 643699
 */
public class UserLogin {
    
    public boolean login (String user, String password){
        return ((user.equals("adam") || user.equals("betty")) && password.equals("password"));
    }
}

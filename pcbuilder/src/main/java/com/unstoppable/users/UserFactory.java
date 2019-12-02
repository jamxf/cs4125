/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unstoppable.users;

/**
 *
 * @author jamesfoley
 */
public class UserFactory {
    
    public User makeUser(String userType, String uname, String upass, int uid, String email){
        User u = null;
        
        if(userType == "Builder"){
            u = new BuilderUser(uname, uid, upass, email);
        }
        else{
            u = new CustomerUser(uname, uid, upass, email);
        }
        return u;  
    }
}

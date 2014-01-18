/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package belajar.swing.domain;

import java.util.UUID;

/**
 *
 * @author feldy
 */
public class User {
    private String id = UUID.randomUUID().toString();
    private String username;
    private String password;
    
//    public User() {
//        this.id = id;
//        this.password = password;
//        this.username = username;
//    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package belajar.swing.domain.service.impl;

import belajar.swing.connection.DatabaseUtilities;
import belajar.swing.domain.User;
import belajar.swing.domain.service.UserService;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author feldy
 */
public class UserServiceImpl implements UserService {

    @Override
    public User insertUser(User user) throws Exception {
        PreparedStatement statment = DatabaseUtilities.getConnection()
                .prepareStatement("insert into m_user values (?,?,?)");
                
        statment.setString(1, user.getId().toString());
        statment.setString(2, user.getUsername());
        statment.setString(3, user.getPassword());
        statment.executeUpdate();
        
        return user;
                
    }

    @Override
    public List<User> getAllUser() throws SQLException {
        Statement st = DatabaseUtilities.getConnection().createStatement();
        ResultSet result = st.executeQuery("select * from m_user");
        List<User> results = new ArrayList();
        while(result.next()) {
            User usr = new User();
            usr.setId(result.getString("id"));
            usr.setUsername(result.getString("username"));
            usr.setPassword(result.getString("password"));
            results.add(usr);
        }
        return results;
    }

    @Override
    public void deleteUserByID(String id) throws SQLException {
         PreparedStatement st = DatabaseUtilities.getConnection()
                 .prepareStatement("delete from m_user where id = ?");
         st.setString(1, id);
         st.executeUpdate();
    }

    @Override
    public void updateUser(User user) throws SQLException {
        PreparedStatement st = DatabaseUtilities.getConnection()
                 .prepareStatement("update m_user set username = ?, password = ? where id = ?");
        st.setString(1, user.getUsername());
        st.setString(2, user.getPassword());
        st.setString(3, user.getId());
        
        st.executeUpdate();
    }
    
}

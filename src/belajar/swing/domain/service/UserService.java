/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package belajar.swing.domain.service;

import belajar.swing.domain.User;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author feldy
 */
public interface UserService {
    User insertUser(User user) throws Exception;
    List<User> getAllUser() throws SQLException;
    void deleteUserByID(String id) throws SQLException;
    void updateUser(User user) throws SQLException;
}

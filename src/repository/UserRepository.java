/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import model.User;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Grade;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class UserRepository {

    public List<User> login(String tk, String mk) throws Exception {
        List<User> list = new ArrayList<>();
        Connection connection = DBcontext.getConnection();
        String sql = "select * from USERS where username = ? and pasword = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, tk);
        preparedStatement.setString(2, mk);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {

            list.add(new User(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)));

        }
        preparedStatement.close();
        connection.close();
        return list;

    }

    public List<User> getAll() throws Exception {
        List<User> listDangKi = new ArrayList<>();
        String sql = "select * from USERS ";
        Connection conn = DBcontext.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet resultSet = stmt.executeQuery(sql);
        while (resultSet.next()) {
            listDangKi.add(new User(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)));
        }
        resultSet.close();
        stmt.close();
        conn.close();
        return listDangKi;
    }

    public void insert(User user) {
        try {
            String sql = "insert into USERS (username , pasword , rolee) values(? , ?  , ?)";
            Connection conn = DBcontext.getConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setString(1, user.getUsername());
            pr.setString(2, user.getPassWord());
            pr.setString(3, user.getRole());
            pr.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

//    public List<User> getList() {
//        return listDangKi;
//    }

}

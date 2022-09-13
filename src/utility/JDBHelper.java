/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.DBcontext;

/**
 *
 * @author Admin
 */
public class JDBHelper {

    public static ResultSet excuteQuery(String sql, Object... args) {
        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet rs = null;
        try {
            conn = DBcontext.getConnection();
            pr = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                pr.setObject(i + 1, args[i]);
            }
            rs = pr.executeQuery();
        } catch (Exception ex) {
            Logger.getLogger(JDBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public static Integer excuteUpdate(String sql, Object... args) {
        Connection conn = null;
        PreparedStatement pr = null;
        Integer row = 0;
        try {
            conn = DBcontext.getConnection();
            pr = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                pr.setObject(i + 1, args[i]);
            }
            row = pr.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(JDBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }
}

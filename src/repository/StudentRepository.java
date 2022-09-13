/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.awt.image.RenderedImage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import model.Student;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Grade;

/**
 *
 * @author Admin
 */
public class StudentRepository {

    public List<Student> getALL() throws Exception {
         List<Student> student = new ArrayList<>();
        String sql = "select * from STUDENTS";
        Connection conn = DBcontext.getConnection();
        Statement stam = conn.createStatement();
        ResultSet rs = stam.executeQuery(sql);
        while (rs.next()) {
            student.add(new Student(rs.getString("maSV"), rs.getString("hoTen"), rs.getString("email"), rs.getString("soDT"), rs.getBoolean("gioiTinh"), rs.getString("diaChi"), rs.getString("hinh")));

        }
        rs.close();
        stam.close();
        conn.close();
        return student;
    }

    public boolean update(Student st) {
        String sql = " UPDATE STUDENTS SET hoTen =? ,email =?,soDT =? , gioiTinh =?,diaChi = ? WHERE maSV =?";
        try (Connection conn = DBcontext.getConnection();
                PreparedStatement pr = conn.prepareStatement(sql);) {
            pr.setString(6, st.getMaSV());
            pr.setString(1, st.getHoTen());
            pr.setString(2, st.getEmail());
            pr.setString(3, st.getSoDT());
            pr.setBoolean(4, st.isGioiTinh());
            pr.setString(5, st.getDiaChi());

            pr.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean insert(Student st) {
        String sql = " insert into STUDENTS(maSV , hoTen , email , soDT,gioiTinh,diaChi) values(? , ? , ? , ?,?,?)	";
        try (Connection conn = DBcontext.getConnection();
                PreparedStatement pr = conn.prepareStatement(sql);) {
            pr.setString(1, st.getMaSV());
            pr.setString(2, st.getHoTen());
            pr.setString(3, st.getEmail());
            pr.setString(4, st.getSoDT());
            pr.setBoolean(5, st.isGioiTinh());
            pr.setString(6, st.getDiaChi());
            pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean delete(String maSV) {
        String sql = "  exec xoa_student ?";
        try (Connection conn = DBcontext.getConnection();
            PreparedStatement pr = conn.prepareStatement(sql);) {
            pr.setString(1, maSV);
            pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;

    }
//    public boolean seach(String maSV){
//    String sql = "select * from STUDENTS where maSV = ?";
//        try (Connection conn = DBcontext.getConnection();
//            PreparedStatement pr = conn.prepareStatement(sql);) {
//            pr.setString(1, maSV);
//            pr.executeQuery();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//
//        return true;
//
//    }
    

//    public static void main(String[] args) {
//
//        try {
//            StudentRepository st = new StudentRepository();
//            List<Student> list = st.getALL();
//            for (Student student : list) {
//                System.out.println(student.getMaSV());
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(StudentRepository.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
    
   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.List;
import model.Grade;
import java.sql.*;
import java.util.ArrayList;

public class QuanLyDiemRepository {

    public List<Grade> getAll() throws Exception {
         List<Grade> grades = new ArrayList<>();
        String sql = "select st.maSV , hoTen, tiengAnh , tinHoc , GDTC  from GRADE gr join STUDENTS st on gr.maSV = st.maSV ";
        Connection conn = DBcontext.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            grades.add(new Grade(rs.getString("maSV"), rs.getString("hoTen"), rs.getFloat("tiengAnh"), rs.getFloat("tinHoc"), rs.getFloat("GDTC")));
        }
        rs.close();
        stmt.close();
        conn.close();
        return grades;
    }

    public boolean insert(Grade gr) {
        String sql = " insert into GRADE(maSV , tiengAnh , tinHoc , GDTC) values(? , ? , ? , ?)	";
        try (Connection conn = DBcontext.getConnection();
                PreparedStatement pr = conn.prepareStatement(sql);) {
            pr.setString(1, gr.getMaSV());
            pr.setFloat(2, gr.getTiengAnh());
            pr.setFloat(3, gr.getTinHoc());
            pr.setFloat(4, gr.getDCTC());
            pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean delete(String maSV) {
        String sql = " delete GRADE where maSV = ?";
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

    public List<Grade> Seach(String maSV) throws Exception {
        List<Grade> ListGrades = new ArrayList<>();
        String sql = "select st.maSV , hoTen , tiengAnh ,tinHoc ,GDTC  from GRADE gr join STUDENTS st on gr.maSV = st.maSV\n"
                + "where gr.maSV = ?";
        try (Connection conn = DBcontext.getConnection();
                PreparedStatement pr = conn.prepareStatement(sql);) {

            pr.setString(1, maSV);
            try (ResultSet rs = pr.executeQuery();) {
                if (rs.next()) {
                    Grade gr = new Grade();
                    gr.setMaSV(rs.getString("maSV"));
                    gr.setHoTen(rs.getString("hoTen"));
                    gr.setTiengAnh(rs.getFloat("tiengAnh"));
                    gr.setTinHoc(rs.getFloat("tinHoc"));
                    gr.setDCTC(rs.getFloat("GDTC"));
                    ListGrades.add(gr);
                    return ListGrades;
                }

            }
            return null;

        }

    }

    public boolean update(Grade gr ) {
        String sql = " UPDATE GRADE SET tiengAnh =? ,tinHoc =?,GDTC =?  WHERE maSV =?";
        try (Connection conn = DBcontext.getConnection();
                PreparedStatement pr = conn.prepareStatement(sql);) {
            pr.setString(4, gr.getMaSV());
            pr.setFloat(1, gr.getTiengAnh());
            pr.setFloat(2, gr.getTinHoc());
            pr.setFloat(3, gr.getDCTC());
           
            pr.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

       return true;
    }
    
    
    
}

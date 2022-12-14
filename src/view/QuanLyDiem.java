/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import java.awt.Color;

import java.util.ArrayList;
import repository.QuanLyDiemRepository;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.GradeService;
import model.Grade;
import service.StudentService;
import model.Student;

/**
 *
 * @author Admin
 */
public class QuanLyDiem extends javax.swing.JDialog {

    DefaultTableModel defaultTableModel = new DefaultTableModel();
    DefaultTableModel model = new DefaultTableModel();
    GradeService gradeService;
    StudentService studentService;

    public QuanLyDiem(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Quản Lý Điểm Sinh Viên");
        gradeService = new GradeService();
        studentService = new StudentService();
        LoadDataDiem();
    }

    private void LoadDataDiem() {
        defaultTableModel = (DefaultTableModel) tb_Grade.getModel();
        defaultTableModel.setRowCount(0);
        List<Grade> grades = gradeService.getAll();
        for (Grade x : grades) {
            defaultTableModel.addRow(new Object[]{
                x.getMaSV(), x.getHoTen(), x.getTiengAnh(), x.getTinHoc(), x.getDCTC(), x.DiemTb()

            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_seach = new javax.swing.JTextField();
        btn_seach = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_tiengAnh = new javax.swing.JLabel();
        txt_tinHoc = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_ten = new javax.swing.JLabel();
        txt_maSV = new javax.swing.JTextField();
        txt_TiengAnh = new javax.swing.JTextField();
        txt_TinHoc = new javax.swing.JTextField();
        txt_GDTC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lbl_diemTB = new javax.swing.JLabel();
        lbl_hoTen = new javax.swing.JLabel();
        lbl_DiemTB = new javax.swing.JLabel();
        btn_new = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Grade = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setPreferredSize(new java.awt.Dimension(600, 614));

        jLabel3.setText("Quản Lý Điểm Sinh Viên");

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setText("Mã SV");

        btn_seach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Search.png"))); // NOI18N
        btn_seach.setText("Seach");
        btn_seach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(59, 59, 59)
                .addComponent(txt_seach, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btn_seach)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_seach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_seach))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel4.setText("Tìm Kiếm");

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setText("Họ Tên SV");

        jLabel7.setText("Mã SV");

        lbl_tiengAnh.setText("Tiếng Anh");

        txt_tinHoc.setText("Tin Học");

        jLabel11.setText("Giáo Dục :TC");

        txt_TiengAnh.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_TiengAnhFocusLost(evt);
            }
        });
        txt_TiengAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_TiengAnhMouseClicked(evt);
            }
        });
        txt_TiengAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TiengAnhActionPerformed(evt);
            }
        });

        jLabel8.setText("Điểm TB");

        lbl_hoTen.setText("jLabel1");
        lbl_hoTen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_hoTenMouseClicked(evt);
            }
        });

        lbl_DiemTB.setBackground(new java.awt.Color(0, 255, 255));
        lbl_DiemTB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_DiemTB.setText("jLabel1");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_tiengAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tinHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_GDTC, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_TiengAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_TinHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_diemTB, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_DiemTB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_hoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_maSV, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(866, 866, 866))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(lbl_ten)
                    .addComponent(lbl_hoTen))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_maSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tiengAnh)
                    .addComponent(txt_TiengAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(2, 2, 2)
                .addComponent(lbl_DiemTB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tinHoc)
                    .addComponent(txt_TinHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_diemTB))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_GDTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        btn_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add.png"))); // NOI18N
        btn_new.setText("New");
        btn_new.setPreferredSize(new java.awt.Dimension(60, 45));
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Save.png"))); // NOI18N
        btn_save.setText("Save");
        btn_save.setPreferredSize(new java.awt.Dimension(60, 45));
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete.png"))); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.setPreferredSize(new java.awt.Dimension(60, 45));
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Edit.png"))); // NOI18N
        btn_update.setText("Update");
        btn_update.setPreferredSize(new java.awt.Dimension(60, 45));
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        tb_Grade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SV", "Họ tên", "Tiếng Anh", "Tin học", "Giáo dục TC", "Điểm Tb"
            }
        ));
        tb_Grade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_GradeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_Grade);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btn_save, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(btn_new, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_delete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_new, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// private boolean checkRong() {
//        if (txt_maSV.getText() == null || txt_TiengAnh.getText() == null || txt_TinHoc == null) {
//
//            return false;
//        }
//        return true;
//    }

    public List<Student> getNhanVien() {
        String maSV = txt_maSV.getText();
        List<Student> list = studentService.getALL();
        for (Student student : list) {
            if (maSV.equals(student.getMaSV())) {
                return list;
            }
        }
        return null;
    }
    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        String maSV = txt_maSV.getText().trim();

        if (maSV.isEmpty() || txt_TiengAnh.getText().trim().isEmpty() || txt_TinHoc.getText().trim().isEmpty() || txt_GDTC.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "dữ liệu không được để trông");
            return;
        }

        try {
            if (Float.parseFloat(txt_TiengAnh.getText().trim()) < 0 || Float.parseFloat(txt_TiengAnh.getText().trim()) > 10) {
                JOptionPane.showMessageDialog(this, "bạn nhập tiêng anh điểm sai");
                return;
            } else if (Float.parseFloat(txt_TinHoc.getText().trim()) < 0 || Float.parseFloat(txt_TinHoc.getText().trim()) > 10) {
                JOptionPane.showMessageDialog(this, "bạn nhập tin học điểm sai");
                return;
            } else if (Float.parseFloat(txt_GDTC.getText().trim()) < 0 || Float.parseFloat(txt_GDTC.getText().trim()) > 10) {
                JOptionPane.showMessageDialog(this, "bạn nhập DGTC điểm sai");
                return;
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "điểm nhập sai cú pháp");
            return;
        }

        if (getNhanVien() != null) {
            Grade gr = new Grade();
            gr.setMaSV(maSV);
            gr.setTiengAnh(Float.parseFloat(txt_TiengAnh.getText().trim()));
            gr.setTinHoc(Float.parseFloat(txt_TinHoc.getText().trim()));
            gr.setDCTC(Float.parseFloat(txt_GDTC.getText().trim()));

            int kt = JOptionPane.showConfirmDialog(this, "bạn muốn thêm Điểm cho sv", "thêm ", JOptionPane.YES_NO_OPTION);

            if (kt == 0) {
                if (gradeService.insert(gr)) {
                    LoadDataDiem();
                } else {
                    JOptionPane.showMessageDialog(this, "thêm không thành công");
                    return;
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "sinh viên không tồn tại");
            return;
        }

//        if (tiengAnh <10 || tinHoc < 10 || DGTC <10) {
//            
//        }

    }//GEN-LAST:event_btn_saveActionPerformed

    private void lbl_hoTenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_hoTenMouseClicked


    }//GEN-LAST:event_lbl_hoTenMouseClicked

    private void txt_TiengAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_TiengAnhMouseClicked
        List<Grade> grades = gradeService.getAll();
        for (Grade grade : grades) {
            if (txt_maSV.getText().equals(grade.getMaSV())) {
                lbl_hoTen.setText(grade.getHoTen());
                return;
            }
            List<Student> students = studentService.getALL();
            for (Student student : students) {
                if (txt_maSV.getText().equals(student.getMaSV())) {
                    lbl_hoTen.setText(student.getHoTen());
                    return;
                }
            }
        }
    }//GEN-LAST:event_txt_TiengAnhMouseClicked

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        String maSV = txt_maSV.getText().trim();
        if (gradeService.Seach(maSV) == null) {
            JOptionPane.showMessageDialog(this, "không tìm thấy sinh viên bạn muốn xoá");
            return;
        }
        int kt = JOptionPane.showConfirmDialog(this, "bạn muốn xoá Điểm cho sv", "xoá ", JOptionPane.YES_NO_OPTION);
        if (kt == 0) {
            if (gradeService.delete(maSV)) {
                LoadDataDiem();
            } else {
                JOptionPane.showMessageDialog(this, "xoá không thành công");
            }

        } else {
            return;
        }

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_seachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seachActionPerformed
        String maSV = txt_seach.getText();
        // QuanLyDiemRepository d = new QuanLyDiemRepository();
        // try {
        List<Grade> listGrades = gradeService.Seach(maSV);

        if (listGrades != null) {
            model = (DefaultTableModel) tb_Grade.getModel();
            model.setRowCount(0);
            for (Grade x : listGrades) {
                model.addRow(new Object[]{
                    x.getMaSV(), x.getHoTen(), x.getTiengAnh(), x.getTinHoc(), x.getDCTC(), x.DiemTb()
                });

            }
        } else {
            JOptionPane.showMessageDialog(this, "không tìm thấy");
            return;
        }
//        } catch (Exception ex) {
//            Logger.getLogger(QuanLyDiem.class.getName()).log(Level.SEVERE, null, ex);
//        }
//     


    }//GEN-LAST:event_btn_seachActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

        if (txt_maSV.getText().trim().isEmpty() || txt_TiengAnh.getText().trim().isEmpty() || txt_TinHoc.getText().trim().isEmpty() || txt_GDTC.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "dữ liệu không được để trông");
            return;
        }
        Grade grades = new Grade();
        //  String maSV = txt_maSV.getText();
        float tiengAnh = Float.parseFloat(txt_TiengAnh.getText());
        float tinHoc = Float.parseFloat(txt_TinHoc.getText());
        float GDTC = Float.parseFloat(txt_GDTC.getText());
        String maSV = txt_maSV.getText();
        grades.setTiengAnh(tiengAnh);
        grades.setTinHoc(tinHoc);
        grades.setDCTC(GDTC);
        grades.setMaSV(maSV);

        if (gradeService.Seach(maSV) == null) {
            JOptionPane.showMessageDialog(this, "không tìm thấy sinh viên bạn muốn update");
            return;
        }
        int kt = JOptionPane.showConfirmDialog(this, "bạn muốn update điểm ", "update ", JOptionPane.YES_NO_OPTION);

        if (kt == 0) {
            if (gradeService.update(grades)) {
                LoadDataDiem();
                JOptionPane.showMessageDialog(this, "update  thành công");
            } else {
                JOptionPane.showMessageDialog(this, "update không thành công");
            }
        } else {
            return;
        }

        // btn_saveActionPerformed(evt);
    }//GEN-LAST:event_btn_updateActionPerformed

    private void txt_TiengAnhFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TiengAnhFocusLost

//            float tiengAnh = Float.parseFloat(txt_tiengAnh.getText());
//            float tinHoc = Float.parseFloat(txt_TinHoc.getText());
//            float GDTC = Float.parseFloat(txt_GDTC.getText());
//            float kt = (tiengAnh + tinHoc + GDTC) / 3;
//            String st = String.format("%.2f", kt);
//            lbl_diemTB.setText(st);

    }//GEN-LAST:event_txt_TiengAnhFocusLost

    private void tb_GradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_GradeMouseClicked
        int row = tb_Grade.getSelectedRow();
        txt_maSV.setText(tb_Grade.getValueAt(row, 0) + "");
        lbl_hoTen.setText(tb_Grade.getValueAt(row, 1) + "");
        txt_TiengAnh.setText(tb_Grade.getValueAt(row, 2) + "");
        txt_TinHoc.setText(tb_Grade.getValueAt(row, 3) + "");
        txt_GDTC.setText(tb_Grade.getValueAt(row, 4) + "");
        lbl_DiemTB.setText(tb_Grade.getValueAt(row, 5) + "");

    }//GEN-LAST:event_tb_GradeMouseClicked

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        txt_seach.setText("");
        txt_maSV.setText("");
        txt_TiengAnh.setText("");
        txt_TinHoc.setText("");
        txt_GDTC.setText("");
    }//GEN-LAST:event_btn_newActionPerformed

    private void txt_TiengAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TiengAnhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TiengAnhActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(QuanLyDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(QuanLyDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(QuanLyDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(QuanLyDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QuanLyDiem dialog = new QuanLyDiem(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_seach;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_DiemTB;
    private javax.swing.JLabel lbl_diemTB;
    private javax.swing.JLabel lbl_hoTen;
    private javax.swing.JLabel lbl_ten;
    private javax.swing.JLabel lbl_tiengAnh;
    private javax.swing.JTable tb_Grade;
    private javax.swing.JTextField txt_GDTC;
    private javax.swing.JTextField txt_TiengAnh;
    private javax.swing.JTextField txt_TinHoc;
    private javax.swing.JTextField txt_maSV;
    private javax.swing.JTextField txt_seach;
    private javax.swing.JLabel txt_tinHoc;
    // End of variables declaration//GEN-END:variables
}

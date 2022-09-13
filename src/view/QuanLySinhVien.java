/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Grade;
import service.StudentService;
import model.Student;
import repository.StudentRepository;

/**
 *
 * @author Admin
 */
public class QuanLySinhVien extends javax.swing.JDialog {

    DefaultTableModel defaultTableModel;
    StudentService studentService;

    public QuanLySinhVien(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        rd_nam.setSelected(true);
        setTitle("Quản Lý Sinh Viên");
        setLocationRelativeTo(null);

        this.studentService = new StudentService();
        this.defaultTableModel = new DefaultTableModel();
        loadDataStudent();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_maSV = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_SDT = new javax.swing.JTextField();
        txt_ten = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_diaChi = new javax.swing.JTextArea();
        btn_new = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_Student = new javax.swing.JTable();
        rd_nam = new javax.swing.JRadioButton();
        rd_nu = new javax.swing.JRadioButton();
        lbl_hinhAnh = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Quản Lý Sinh Viên");

        jLabel2.setText("Mã SV");

        jLabel3.setText("Họ Tên");

        jLabel4.setText("Email");

        jLabel5.setText("Số ĐT");

        jLabel6.setText("Giới Tính");

        jLabel7.setText("Địa Chi");

        txt_diaChi.setColumns(20);
        txt_diaChi.setRows(5);
        jScrollPane1.setViewportView(txt_diaChi);

        btn_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add.png"))); // NOI18N
        btn_new.setText("New");
        btn_new.setPreferredSize(new java.awt.Dimension(55, 40));
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete.png"))); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.setPreferredSize(new java.awt.Dimension(55, 40));
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Save.png"))); // NOI18N
        btn_save.setText("Save");
        btn_save.setPreferredSize(new java.awt.Dimension(55, 40));
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Edit.png"))); // NOI18N
        btn_update.setText("Update");
        btn_update.setPreferredSize(new java.awt.Dimension(55, 40));
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        tb_Student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SV", "Họ Tên", "Email", "Số ĐT", "Giới Tính", "Địa Chỉ", "Hình"
            }
        ));
        tb_Student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_StudentMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_Student);

        buttonGroup1.add(rd_nam);
        rd_nam.setText("Nam");

        buttonGroup1.add(rd_nu);
        rd_nu.setText("Nữ");

        lbl_hinhAnh.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                            .addComponent(btn_new, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                            .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rd_nam)
                                        .addGap(18, 18, 18)
                                        .addComponent(rd_nu))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_maSV, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl_hinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_maSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbl_hinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rd_nam)
                    .addComponent(rd_nu))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_new, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    private void img(String img) {
//        ImageIcon image = new ImageIcon("D:\\java3\\baiTap\\ams1\\src\\images" + img);
//        Image im = image.getImage();
//        ImageIcon icon = new ImageIcon(im.getScaledInstance(lbl_hinhAnh.getWidth(), lbl_hinhAnh.getHeight(), im.SCALE_SMOOTH));
//        lbl_hinhAnh.setIcon(icon);
//    }
    private void tb_StudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_StudentMouseClicked
        int row = tb_Student.getSelectedRow();
        txt_maSV.setText(tb_Student.getValueAt(row, 0) + "");
        txt_ten.setText(tb_Student.getValueAt(row, 1) + "");
        txt_email.setText(tb_Student.getValueAt(row, 2) + "");
        txt_SDT.setText(tb_Student.getValueAt(row, 3) + "");
        if (tb_Student.getValueAt(row, 4).equals("Nam")) {
            rd_nam.setSelected(true);
        } else {
            rd_nu.setSelected(true);
        }

        txt_diaChi.setText(tb_Student.getValueAt(row, 5) + "");


    }//GEN-LAST:event_tb_StudentMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        if (txt_maSV.getText().equals("") || txt_ten.getText().equals("") || txt_email.getText().equals("")
                || txt_SDT.getText().equals("") || txt_diaChi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "dữ liệu không được để trống");
            return;

        }
        Student st = new Student();
        st.setMaSV(txt_maSV.getText());
        st.setHoTen(txt_ten.getText());
        st.setEmail(txt_email.getText());
        st.setSoDT(txt_SDT.getText());
        if (rd_nam.isSelected()) {
            st.setGioiTinh(true);
        } else {
            st.setGioiTinh(false);
        }
        st.setDiaChi(txt_diaChi.getText());


       
            Pattern p = Pattern.compile("^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z]+(\\.[a-zA-Z]+){1,3}$");
            String email = txt_email.getText();
            if (!p.matcher(email).find()) {
               JOptionPane.showMessageDialog(this, "email chưa nhập đúng định dạng");

                return; 
            } 

                
            

       
        if (studentService.update(st)) {
            loadDataStudent();
            JOptionPane.showMessageDialog(this, "update  thành công");

        } else {
            JOptionPane.showMessageDialog(this, "update không thành công");
            return;
        }

    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
         if (txt_maSV.getText().equals("") || txt_ten.getText().equals("") || txt_email.getText().equals("")
                || txt_SDT.getText().equals("") || txt_diaChi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "dữ liệu không được để trống");
            return;

        }
        
        Student st = new Student();
        st.setMaSV(txt_maSV.getText().trim());
        st.setHoTen(txt_ten.getText().trim());
        st.setEmail(txt_email.getText().trim());
        st.setSoDT(txt_SDT.getText().trim());
        if (rd_nam.isSelected()) {
            st.setGioiTinh(true);
        } else {
            st.setGioiTinh(false);
        }
        st.setDiaChi(txt_diaChi.getText().trim());
      
       List<Student> list = studentService.getALL();
        for (Student student :list) {
            if (student.getMaSV().equals(txt_maSV.getText())) {
                JOptionPane.showMessageDialog(this, "mã sinh viên đã tồn tại");
                return;

            }
        }
    
            Pattern p = Pattern.compile("^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z]+(\\.[a-zA-Z]+){1,3}$");
            String email = txt_email.getText();
            if (!p.matcher(email).find()) {
              JOptionPane.showMessageDialog(this, "email chưa nhập đúng định dạng");
                             return;
            } 
         Pattern p2 = Pattern.compile("^[0-9]{10}$");
         if (!p2.matcher(txt_SDT.getText()).find()) {
             JOptionPane.showMessageDialog(this, "số điện thoại chỉ được nhập 10 số");
          return;
        }
        
        int kt = JOptionPane.showConfirmDialog(this, "bạn muốn thêm  sv", "thêm ", JOptionPane.YES_NO_OPTION);
        if (kt == 0) {
            if (studentService.insert(st)) {
                loadDataStudent();
               SanPham sp = new SanPham(st);
            
            } else {
                JOptionPane.showMessageDialog(this, "không tìm thấy sinh viên bạn muốn xoá");
            }

        } else {
            return;
        }
    
    }//GEN-LAST:event_btn_saveActionPerformed
         public List<Student> checkTrung(){
          String maSV = txt_maSV.getText().trim();
            List<Student> listStudent = studentService.getALL();
        for (Student student : listStudent) {
            if (maSV.equals(student.getMaSV())) {
                return listStudent;
            } 
        }
        return null;
         }
    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        String maSV = txt_maSV.getText().trim();
             if (maSV.equals("")) {
            JOptionPane.showMessageDialog(this, "mời bạn nhập mã sinh viên bạn cần xoá");
            return;

        }
        if (checkTrung() == null) {
            JOptionPane.showMessageDialog(this, "không tìm thấy sv bạn muốn xoá");
            return;
        }
        int kt = JOptionPane.showConfirmDialog(this, "bạn muốn xoá  sv", "xoá ", JOptionPane.YES_NO_OPTION);

        if (kt == 0) {
            if (studentService.delete(maSV)) {
                loadDataStudent();

            } else {
                JOptionPane.showMessageDialog(this, "xoá không thành công");

            }

        } else {
            return;
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        txt_maSV.setText("");
        txt_ten.setText("");
        txt_email.setText("");
        txt_SDT.setText("");
        txt_diaChi.setText("");
    }//GEN-LAST:event_btn_newActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QuanLySinhVien dialog = new QuanLySinhVien(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_hinhAnh;
    private javax.swing.JRadioButton rd_nam;
    private javax.swing.JRadioButton rd_nu;
    private javax.swing.JTable tb_Student;
    private javax.swing.JTextField txt_SDT;
    private javax.swing.JTextArea txt_diaChi;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_maSV;
    private javax.swing.JTextField txt_ten;
    // End of variables declaration//GEN-END:variables

    private void loadDataStudent() {
        // StudentRepository studentRepository = new StudentRepository();
        defaultTableModel = (DefaultTableModel) tb_Student.getModel();
        defaultTableModel.setRowCount(0);
        List<Student> listStudent = studentService.getALL();
        for (Student x : listStudent) {
            String gioiTinh;
            if (x.isGioiTinh() == true) {
                gioiTinh = "Nam";
            } else {
                gioiTinh = "Nữ";
            }
            defaultTableModel.addRow(new Object[]{
                x.getMaSV(),
                x.getHoTen(),
                x.getEmail(),
                x.getSoDT(),
                gioiTinh,
                x.getDiaChi(),
                x.getHinh()
            });

        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import database.JDBCUtill;
import java.sql.ResultSet;
import util.PassWordUtil;

/**
 *
 * @author Haitaiba
 */
public class DangKy extends javax.swing.JFrame {

    /**
     * Creates new form DangKy
     */
    public DangKy() {
        initComponents();
        loadMaKhachThue();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTaiKhoan = new javax.swing.JTextField();
        cbVaiTro = new javax.swing.JComboBox<>();
        btDangKy = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbMaKhachThue = new javax.swing.JComboBox<>();
        btHuy = new javax.swing.JButton();
        txtXacNhanMatKhau = new javax.swing.JPasswordField();
        txtMatKhau = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đăng Ký Tài Khoản");

        jLabel2.setText("Vai Trò:");

        jLabel3.setText("Tài Khoản:");

        jLabel4.setText("Xác nhận mật khẩu:");

        jLabel5.setText("Mật Khẩu:");

        cbVaiTro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "khach", "admin", " " }));
        cbVaiTro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVaiTroActionPerformed(evt);
            }
        });

        btDangKy.setText("Đăng Ký");
        btDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDangKyActionPerformed(evt);
            }
        });

        jLabel6.setText("Mã khách thuê:");

        cbMaKhachThue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMaKhachThueActionPerformed(evt);
            }
        });

        btHuy.setText("Hủy");
        btHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtTaiKhoan)
                        .addComponent(cbVaiTro, 0, 120, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btDangKy)
                        .addGap(47, 47, 47)
                        .addComponent(btHuy)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(cbMaKhachThue, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtXacNhanMatKhau)
                    .addComponent(txtMatKhau))
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(txtMatKhau))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtXacNhanMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btDangKy)
                            .addComponent(btHuy)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(cbMaKhachThue, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDangKyActionPerformed
        // TODO add your handling code here:
        String taiKhoan = txtTaiKhoan.getText().trim();
        String matKhau = txtMatKhau.getText().trim();
        String xacNhanMatKhau = txtXacNhanMatKhau.getText().trim();
        String vaiTro = cbVaiTro.getSelectedItem().toString();
        String maKhachThue = cbMaKhachThue.getSelectedItem() != null ? cbMaKhachThue.getSelectedItem().toString() : "";
        // Kiểm tra dữ liệu đầu vào
        if (taiKhoan.isEmpty() || matKhau.isEmpty() || xacNhanMatKhau.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!", "Lỗi", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!matKhau.equals(xacNhanMatKhau)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Mật khẩu và xác nhận mật khẩu không khớp!", "Lỗi", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Kiểm tra xem tài khoản đã tồn tại chưa
            Connection conn = JDBCUtill.getConnection();
            String sqlCheck = "SELECT * FROM nguoidung WHERE taikhoan = ?";
            PreparedStatement psCheck = conn.prepareStatement(sqlCheck);
            psCheck.setString(1, taiKhoan);
            ResultSet rss = psCheck.executeQuery();

            if (rss.next()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Tài khoản đã tồn tại!", "Lỗi", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            psCheck.close();
            JDBCUtill.closeConnection(conn);

            // Kết nối csdl và thêm tài khoản
            Connection con = JDBCUtill.getConnection();
            String sql;
            if ("admin".equals(vaiTro)) {

                sql = "INSERT INTO nguoidung(taikhoan,matkhau,vaitro) VALUES(?,?,?)";
            } else {

                sql = "INSERT INTO nguoidung(taikhoan,matkhau,vaitro,makhachthue) VALUES(?,?,?,?)";
            }
            PreparedStatement ps = con.prepareStatement(sql);
            //Mã hóa mật khẩu 
            try {
                matKhau = PassWordUtil.toSHA1(matKhau);
            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Lỗi mã hóa mật khẩu!", "Lỗi", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            ps.setString(1, taiKhoan);
            ps.setString(2, matKhau);
            ps.setString(3, vaiTro);
            if (!"admin".equals(vaiTro)) {
                ps.setString(4, maKhachThue);
            }
            int result = ps.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Thêm tài khoản thành công!");
            } else {
                JOptionPane.showMessageDialog(this, "Thêm tài khoản thất bại!");
            }
            ps.close();
            JDBCUtill.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btDangKyActionPerformed

    private void cbMaKhachThueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMaKhachThueActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_cbMaKhachThueActionPerformed

    private void cbVaiTroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVaiTroActionPerformed
        // TODO add your handling code here:
        String luaChon = (String) cbVaiTro.getSelectedItem();
        if ("admin".equals(luaChon)) {
            cbMaKhachThue.setEnabled(false);
            cbMaKhachThue.removeAllItems();
        } else if ("khach".equals(luaChon)) {
            cbMaKhachThue.setEnabled(true);
            loadMaKhachThue();
        }
    }//GEN-LAST:event_cbVaiTroActionPerformed

    private void btHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHuyActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btHuyActionPerformed

    /**
     * @param args the command line arguments
     */
    private void loadMaKhachThue() {
        cbMaKhachThue.removeAllItems();
        try {
            String sql = "SELECT makhachthue FROM khachthue";
            Connection con = JDBCUtill.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cbMaKhachThue.addItem(rs.getString("makhachthue"));
            }
            JDBCUtill.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi load mã khách thuê");
        }
    }

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
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangKy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDangKy;
    private javax.swing.JButton btHuy;
    private javax.swing.JComboBox<String> cbMaKhachThue;
    private javax.swing.JComboBox<String> cbVaiTro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTaiKhoan;
    private javax.swing.JPasswordField txtXacNhanMatKhau;
    // End of variables declaration//GEN-END:variables
}

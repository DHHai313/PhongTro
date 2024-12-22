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
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.text.DecimalFormat;

/**
 *
 * @author ASUS
 */
public class HD extends javax.swing.JFrame {

    /**
     * Creates new form HD
     */
    public HD() {
        initComponents();
        setLocationRelativeTo(null);
        loadMaKhachThueToComboBox();
        loadMaPhongToComboBox();
        loadDataToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbMaKhachThue = new javax.swing.JComboBox<>();
        cbMaPhong = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTienPhong = new javax.swing.JTextField();
        txtTienDien = new javax.swing.JTextField();
        txtTienNuoc = new javax.swing.JTextField();
        cbThanhToan = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        btThem = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã hoá đơn", "Mã khách thuê", "Mã phòng", "Tiền điện", "Tiền nước", "Tiền phòng", "Tổng tiền", "Thanh toán"
            }
        ));
        jTable2.setPreferredSize(new java.awt.Dimension(100, 50));
        jScrollPane2.setViewportView(jTable2);

        btSua.setText("Sửa");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btXoa.setText("Xoá");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        jLabel5.setText("Mã khách thuê");

        jLabel6.setText("Mã phòng");

        cbMaKhachThue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMaKhachThueActionPerformed(evt);
            }
        });

        cbMaPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMaPhongActionPerformed(evt);
            }
        });

        jLabel1.setText("Tiền điện");

        jLabel2.setText("Tiền nước");

        jLabel3.setText("Tiền phòng");

        jLabel7.setText("Thanh toán");

        txtTienPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTienPhongActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Quản Lý Hóa Đơn");

        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cbMaKhachThue, 0, 125, Short.MAX_VALUE)
                        .addComponent(cbMaPhong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTienNuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTienPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbThanhToan)
                    .addComponent(txtTienDien, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTienPhong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTienDien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(cbMaKhachThue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtTienNuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(cbMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbThanhToan))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSua)
                    .addComponent(btThem)
                    .addComponent(btXoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRow = jTable2.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn hóa đơn cần sửa!");
                return;
            }

            String maHoaDon = jTable2.getValueAt(selectedRow, 0).toString();

            Connection con = JDBCUtill.getConnection();
            String sql = "UPDATE hoadon SET makhachthue = ?, maphong = ?, tiendien = ?, tiennuoc = ?, tienphong = ?, thanhtoan = ? WHERE mahoadon = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, cbMaKhachThue.getSelectedItem().toString());
            ps.setString(2, cbMaPhong.getSelectedItem().toString());
            ps.setDouble(3, Double.parseDouble(txtTienDien.getText()));
            ps.setDouble(4, Double.parseDouble(txtTienNuoc.getText()));
            ps.setDouble(5, Double.parseDouble(txtTienPhong.getText()));
            ps.setBoolean(6, cbThanhToan.isSelected());
            ps.setString(7, maHoaDon);

            int result = ps.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Sửa hóa đơn thành công!");
            }
            loadDataToTable();
            ps.close();
            JDBCUtill.closeConnection(con);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi sửa hóa đơn: " + e.getMessage());
        }catch (Exception e){
             JOptionPane.showMessageDialog(this, "Lỗi khi sửa hóa đơn: " + e.getMessage());
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void cbMaKhachThueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMaKhachThueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMaKhachThueActionPerformed

    private void cbMaPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMaPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMaPhongActionPerformed

    private void txtTienPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTienPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTienPhongActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = JDBCUtill.getConnection();
            String sql = "INSERT INTO hoadon (makhachthue, maphong, tiendien, tiennuoc, tienphong, tongtien, thanhtoan) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            Double tienDien = Double.parseDouble(txtTienDien.getText());
            Double tienNuoc = Double.parseDouble(txtTienNuoc.getText());
            Double tienPhong = Double.parseDouble(txtTienPhong.getText());
            Double tongTien =  tienDien+tienNuoc+tienPhong;
            ps.setString(1, cbMaKhachThue.getSelectedItem().toString());
            ps.setString(2, cbMaPhong.getSelectedItem().toString());
            ps.setDouble(3, tienDien);
            ps.setDouble(4, tienNuoc);
            ps.setDouble(5, tienPhong);
            ps.setDouble(6, tongTien);
            ps.setBoolean(7, cbThanhToan.isSelected());

            int result = ps.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Thêm hóa đơn thành công!");
            }
            loadDataToTable();
            ps.close();
            JDBCUtill.closeConnection(con);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi thêm hóa đơn: " + e.getMessage());
        }
    }//GEN-LAST:event_btThemActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRow = jTable2.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn hóa đơn cần xóa!");
                return;
            }

            String maHoaDon = jTable2.getValueAt(selectedRow, 0).toString();

            Connection con = JDBCUtill.getConnection();
            String sql = "DELETE FROM hoadon WHERE mahoadon = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, maHoaDon);

            int result = ps.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Xóa hóa đơn thành công!");
            }
            loadDataToTable();
            ps.close();
            JDBCUtill.closeConnection(con);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi xóa hóa đơn: " + e.getMessage());
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Home h = new Home();
        h.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    private void loadDataToTable() {
       try {
        Connection con = JDBCUtill.getConnection();
        String sql = "SELECT * FROM hoadon";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        // Lấy model của jTable2
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0); // Xóa dữ liệu cũ

        // Tạo định dạng cho số tiền
        DecimalFormat formatter = new DecimalFormat("#,###");

        // Đổ dữ liệu vào bảng
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("mahoadon"),
                rs.getString("makhachthue"),
                rs.getString("maphong"),
                formatter.format(rs.getFloat("tiendien")),   
                formatter.format(rs.getFloat("tiennuoc")),  
                formatter.format(rs.getFloat("tienphong")),  
                formatter.format(rs.getFloat("tongtien")),   
                rs.getBoolean("thanhtoan") ? "Đã thanh toán" : "Chưa thanh toán"
            });
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu hóa đơn: " + e.getMessage());
    }
    }

    private void loadMaKhachThueToComboBox() {
        try {
            Connection con = JDBCUtill.getConnection();
            String sql = "SELECT makhachthue FROM khachthue";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            cbMaKhachThue.removeAllItems(); // Xóa các item cũ trong combo box
            while (rs.next()) {
                cbMaKhachThue.addItem(rs.getString("makhachthue")); // Thêm mã khách thuê vào combo box
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi tải mã khách thuê: " + e.getMessage());
        }
    }

    private void loadMaPhongToComboBox() {
        try {
            Connection con = JDBCUtill.getConnection();
            String sql = "SELECT maphong FROM phongtro";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            cbMaPhong.removeAllItems(); // Xóa các item cũ trong combo box
            while (rs.next()) {
                cbMaPhong.addItem(rs.getString("maphong")); // Thêm mã phòng vào combo box
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi tải mã phòng: " + e.getMessage());
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
            java.util.logging.Logger.getLogger(HD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.JComboBox<String> cbMaKhachThue;
    private javax.swing.JComboBox<String> cbMaPhong;
    private javax.swing.JCheckBox cbThanhToan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtTienDien;
    private javax.swing.JTextField txtTienNuoc;
    private javax.swing.JTextField txtTienPhong;
    // End of variables declaration//GEN-END:variables
}

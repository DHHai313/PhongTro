package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.KhachThue;

public class KhachThueDAO implements DAOInterface<KhachThue> {

    @Override
    public ArrayList<KhachThue> selectAll() {
        ArrayList<KhachThue> result = new ArrayList<>();
        Connection c = JDBCUtill.getConnection();
        String sql = "SELECT * FROM khachthue";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int maKhachThue = rs.getInt("makhachthue");
                String hoVaTen = rs.getString("hovaten");
                String soDienThoai = rs.getString("sodienthoai");
                int maPhong = rs.getInt("maphong");
                String cccd = rs.getString("cccd");

                KhachThue kt = new KhachThue(maKhachThue, hoVaTen, soDienThoai, maPhong, cccd);
                result.add(kt);
            }
            JDBCUtill.closeConnection(c);
        } catch (SQLException ex) {
            Logger.getLogger(KhachThueDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public KhachThue selectById(KhachThue t) {
        KhachThue result = null;
        Connection c = JDBCUtill.getConnection();
        String sql = "SELECT * FROM khachthue WHERE makhachthue = ?";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setInt(1, t.getMaKhachThue());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int maKhachThue = rs.getInt("makhachthue");
                String hoVaTen = rs.getString("hovaten");
                String soDienThoai = rs.getString("sodienthoai");
                int maPhong = rs.getInt("maphong");
                String cccd = rs.getString("cccd");

                result = new KhachThue(maKhachThue, hoVaTen, soDienThoai, maPhong, cccd);
            }
            JDBCUtill.closeConnection(c);
        } catch (SQLException ex) {
            Logger.getLogger(KhachThueDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public int insert(KhachThue t) {
        Connection c = JDBCUtill.getConnection();
        String sql = "INSERT INTO khachthue (hovaten, sodienthoai, maphong, cccd) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, t.getHoVaTen());
            pst.setString(2, t.getSoDienThoai());
            pst.setInt(3, t.getMaPhong());
            pst.setString(4, t.getCccd());
            int rows = pst.executeUpdate();
            JDBCUtill.closeConnection(c);
            return rows;
        } catch (SQLException ex) {
            Logger.getLogger(KhachThueDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int insertAll(ArrayList<KhachThue> arr) {
        int count = 0;
        for (KhachThue t : arr) {
            count += insert(t);
        }
        return count;
    }

    @Override
    public int delete(KhachThue t) {
        Connection c = JDBCUtill.getConnection();
        String sql = "DELETE FROM khachthue WHERE makhachthue = ?";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setInt(1, t.getMaKhachThue());
            int rows = pst.executeUpdate();
            JDBCUtill.closeConnection(c);
            return rows;
        } catch (SQLException ex) {
            Logger.getLogger(KhachThueDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int deleteAll(ArrayList<KhachThue> arr) {
        int count = 0;
        for (KhachThue t : arr) {
            count += delete(t);
        }
        return count;
    }

    @Override
    public int update(KhachThue t) {
        Connection c = JDBCUtill.getConnection();
        String sql = "UPDATE khachthue SET hovaten = ?, sodienthoai = ?, maphong = ?, cccd = ? WHERE makhachthue = ?";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, t.getHoVaTen());
            pst.setString(2, t.getSoDienThoai());
            pst.setInt(3, t.getMaPhong());
            pst.setString(4, t.getCccd());
            pst.setInt(5, t.getMaKhachThue());
            int rows = pst.executeUpdate();
            JDBCUtill.closeConnection(c);
            return rows;
        } catch (SQLException ex) {
            Logger.getLogger(KhachThueDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}

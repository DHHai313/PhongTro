package database;

import java.util.ArrayList;
import model.PhongTro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PhongTroDAO implements DAOInterface<PhongTro> {

    @Override
    public ArrayList<PhongTro> selectAll() {
        ArrayList<PhongTro> result = new ArrayList<>();
        Connection c = JDBCUtill.getConnection();
        String sql = "SELECT * FROM phongtro";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int maPhongTro = rs.getInt("maphong");
                String tenPhong = rs.getString("tenphong");
                boolean trangThai = rs.getBoolean("trangthai");
                String doDac = rs.getString("dodac");
                PhongTro pt = new PhongTro(maPhongTro, tenPhong, trangThai, doDac);
                result.add(pt);
            }
            JDBCUtill.closeConnection(c);
        } catch (SQLException ex) {
            Logger.getLogger(PhongTroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public PhongTro selectById(PhongTro t) {
        PhongTro result = null;
        Connection c = JDBCUtill.getConnection();
        String sql = "SELECT * FROM phongtro WHERE maphong = ?";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setInt(1, t.getMaPhong());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int maPhongTro = rs.getInt("maphong");
                String tenPhong = rs.getString("tenphong");
                boolean trangThai = rs.getBoolean("trangthai");
                String doDac = rs.getString("dodac");
                result = new PhongTro(maPhongTro, tenPhong, trangThai, doDac);
            }
            JDBCUtill.closeConnection(c);
        } catch (SQLException ex) {
            Logger.getLogger(PhongTroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public int insert(PhongTro t) {
        Connection c = JDBCUtill.getConnection();
        String sql = "INSERT INTO phongtro (tenphong, trangthai, dodac) VALUES ( ?, ?, ?)";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
        
            pst.setString(1, t.getTenPhong());
            pst.setBoolean(2, t.getTrangThai());
            pst.setString(3, t.getDoDac());
            int rows = pst.executeUpdate();
            JDBCUtill.closeConnection(c);
            return rows;
        } catch (SQLException ex) {
            Logger.getLogger(PhongTroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int insertAll(ArrayList<PhongTro> arr) {
        int count = 0;
        for (PhongTro t : arr) {
            count += insert(t);
        }
        return count;
    }

    @Override
    public int delete(PhongTro t) {
        Connection c = JDBCUtill.getConnection();
        String sql = "DELETE FROM phongtro WHERE maphong = ?";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
             pst.setInt(1, t.getMaPhong());
            int rows = pst.executeUpdate();
            JDBCUtill.closeConnection(c);
            return rows;
        } catch (SQLException ex) {
            Logger.getLogger(PhongTroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int deleteAll(ArrayList<PhongTro> arr) {
        int count = 0;
        for (PhongTro t : arr) {
            count += delete(t);
        }
        return count;
    }

    @Override
    public int update(PhongTro t) {
        Connection c = JDBCUtill.getConnection();
        String sql = "UPDATE phongtro SET tenphong = ?, trangthai = ?, dodac = ? WHERE maphong = ?";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, t.getTenPhong());
            pst.setBoolean(2, t.getTrangThai());
            pst.setString(3, t.getDoDac());
          pst.setInt(1, t.getMaPhong());
            int rows = pst.executeUpdate();
            JDBCUtill.closeConnection(c);
            return rows;
        } catch (SQLException ex) {
            Logger.getLogger(PhongTroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}

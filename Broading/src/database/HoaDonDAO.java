package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.HoaDon;

/**
 *
 * @author Haitaiba
 */
public class HoaDonDAO implements DAOInterface<HoaDon> {

    @Override
    public ArrayList<HoaDon> selectAll() {
        ArrayList<HoaDon> result = new ArrayList<>();
        Connection c = JDBCUtill.getConnection();
        String sql = "SELECT * FROM hoadon";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int maHoaDon = rs.getInt("mahoadon");
                int maKhachThue = rs.getInt("makhachthue");
                int maPhong = rs.getInt("maphong");
                double tienDien = rs.getDouble("tiendien");
                double tienNuoc = rs.getDouble("tiennuoc");
                double tienPhong = rs.getDouble("tienphong");
                double tongTien = rs.getDouble("tongtien");
                boolean thanhToan = rs.getBoolean("thanhtoan");
                HoaDon hd = new HoaDon(maHoaDon, maKhachThue, maPhong, tienDien, tienNuoc, tienPhong, tongTien, thanhToan);
                result.add(hd);
            }
            JDBCUtill.closeConnection(c);
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public HoaDon selectById(HoaDon t) {
        HoaDon result = null;
        Connection c = JDBCUtill.getConnection();
        String sql = "SELECT * FROM hoadon WHERE mahoadon = ?";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setInt(1, t.getMaHoaDon());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int maHoaDon = rs.getInt("mahoadon");
                int maKhachThue = rs.getInt("makhachthue");
                int maPhong = rs.getInt("maphong");
                double tienDien = rs.getDouble("tiendien");
                double tienNuoc = rs.getDouble("tiennuoc");
                double tienPhong = rs.getDouble("tienphong");
                double tongTien = rs.getDouble("tongtien");
                boolean thanhToan = rs.getBoolean("thanhtoan");
                result = new HoaDon(maHoaDon, maKhachThue, maPhong, tienDien, tienNuoc, tienPhong, tongTien, thanhToan);
            }
            JDBCUtill.closeConnection(c);
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public int insert(HoaDon t) {
        Connection c = JDBCUtill.getConnection();
        String sql = "INSERT INTO hoadon (makhachthue, maphong, tiendien, tiennuoc, tienphong, tongtien, thanhtoan) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setInt(1, t.getMaKhachThue());
            pst.setInt(2, t.getMaPhong());
            pst.setDouble(3, t.getTienDien());
            pst.setDouble(4, t.getTienNuoc());
            pst.setDouble(5, t.getTienPhong());
            pst.setDouble(6, t.getTongTien());
            pst.setBoolean(7, t.isThanhToan());
            int rows = pst.executeUpdate();
            JDBCUtill.closeConnection(c);
            return rows;
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int insertAll(ArrayList<HoaDon> arr) {
        int count = 0;
        for (HoaDon t : arr) {
            count += insert(t);
        }
        return count;
    }

    @Override
    public int delete(HoaDon t) {
        Connection c = JDBCUtill.getConnection();
        String sql = "DELETE FROM hoadon WHERE mahoadon = ?";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setInt(1, t.getMaHoaDon());
            int rows = pst.executeUpdate();
            JDBCUtill.closeConnection(c);
            return rows;
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int deleteAll(ArrayList<HoaDon> arr) {
        int count = 0;
        for (HoaDon t : arr) {
            count += delete(t);
        }
        return count;
    }

    @Override
    public int update(HoaDon t) {
        Connection c = JDBCUtill.getConnection();
        String sql = "UPDATE hoadon SET makhachthue = ?, maphong = ?, tiendien = ?, tiennuoc = ?, tienphong = ?, tongtien = ?, thanhtoan = ? WHERE mahoadon = ?";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setInt(1, t.getMaKhachThue());
            pst.setInt(2, t.getMaPhong());
            pst.setDouble(3, t.getTienDien());
            pst.setDouble(4, t.getTienNuoc());
            pst.setDouble(5, t.getTienPhong());
            pst.setDouble(6, t.getTongTien());
            pst.setBoolean(7, t.isThanhToan());
            pst.setInt(8, t.getMaHoaDon());
            int rows = pst.executeUpdate();
            JDBCUtill.closeConnection(c);
            return rows;
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}

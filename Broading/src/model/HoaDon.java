package model;

/**
 *
 * @author Haitaiba
 */
public class HoaDon {
    private int maHoaDon;
    private int maKhachThue;
    private int maPhong;
    private double tienDien;
    private double tienNuoc;
    private double tienPhong;
    private double tongTien;
    private boolean thanhToan;

    public HoaDon() {
    }

    public HoaDon(int maHoaDon, int maKhachThue, int maPhong, double tienDien, double tienNuoc, double tienPhong, double tongTien, boolean thanhToan) {
        this.maHoaDon = maHoaDon;
        this.maKhachThue = maKhachThue;
        this.maPhong = maPhong;
        this.tienDien = tienDien;
        this.tienNuoc = tienNuoc;
        this.tienPhong = tienPhong;
        this.tongTien = tongTien;
        this.thanhToan = thanhToan;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public int getMaKhachThue() {
        return maKhachThue;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public double getTienDien() {
        return tienDien;
    }

    public double getTienNuoc() {
        return tienNuoc;
    }

    public double getTienPhong() {
        return tienPhong;
    }

    public double getTongTien() {
        return tongTien;
    }

    public boolean isThanhToan() {
        return thanhToan;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public void setMaKhachThue(int maKhachThue) {
        this.maKhachThue = maKhachThue;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public void setTienDien(double tienDien) {
        this.tienDien = tienDien;
    }

    public void setTienNuoc(double tienNuoc) {
        this.tienNuoc = tienNuoc;
    }

    public void setTienPhong(double tienPhong) {
        this.tienPhong = tienPhong;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public void setThanhToan(boolean thanhToan) {
        this.thanhToan = thanhToan;
    }
}

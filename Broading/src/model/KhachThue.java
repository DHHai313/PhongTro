/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Haitaiba
 */
public class KhachThue {
    private int maKhachThue;
    private String hoVaTen;
    private String soDienThoai;
    private int maPhong;
    private String cccd;

    public KhachThue() {
    }

    public KhachThue(int maKhachThue, String hoVaTen, String soDienThoai, int maPhong, String cccd) {
        this.maKhachThue = maKhachThue;
        this.hoVaTen = hoVaTen;
        this.soDienThoai = soDienThoai;
        this.maPhong = maPhong;
        this.cccd = cccd;
    }

    public int getMaKhachThue() {
        return maKhachThue;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public String getCccd() {
        return cccd;
    }

    public void setMaKhachThue(int maKhachThue) {
        this.maKhachThue = maKhachThue;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }
    
}

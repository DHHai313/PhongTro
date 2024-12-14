/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Haitaiba
 */
public class PhongTro {
    private int maPhong;
    private String tenPhong;
    private boolean trangThai;
    private String doDac;

    public PhongTro() {
    }

    public PhongTro(int maPhong, String tenPhong, boolean trangThai, String doDac) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.trangThai = trangThai;
        this.doDac = doDac;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public boolean getTrangThai() {
        return trangThai;
    }

    public String getDoDac() {
        return doDac;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public void setDoDac(String doDac) {
        this.doDac = doDac;
    }
    
}

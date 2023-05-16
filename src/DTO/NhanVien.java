/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Luu Quang Khai
 */
public class NhanVien {
    private String MaNhanVien, TenNhanVien, MatKhau,CCCD,SoDienThoai,GioiTinh;
    private Date NgaySinh;

    public NhanVien() {
    }

    public NhanVien(String MaNhanVien, String TenNhanVien, String MatKhau, String CCCD, String SoDienThoai, String GioiTinh, Date NgaySinh) {
        this.MaNhanVien = MaNhanVien;
        this.TenNhanVien = TenNhanVien;
        this.MatKhau = MatKhau;
        this.CCCD = CCCD;
        this.SoDienThoai = SoDienThoai;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public String getTenNhanVien() {
        return TenNhanVien;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public String getCCCD() {
        return CCCD;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public void setTenNhanVien(String TenNhanVien) {
        this.TenNhanVien = TenNhanVien;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }
    
    
}

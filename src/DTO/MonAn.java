/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Luu Quang Khai
 */
public class MonAn {
    private int MaMonAn;
    private String TenMonAn;
    private float GiaTien;
    private int SoLuong;
    private int MaLoaiMon;

    public MonAn() {
    }

    public MonAn(int MaMonAn, String TenMonAn, float GiaTien, int SoLuong, int MaLoaiMon) {
        this.MaMonAn = MaMonAn;
        this.TenMonAn = TenMonAn;
        this.GiaTien = GiaTien;
        this.SoLuong = SoLuong;
        this.MaLoaiMon = MaLoaiMon;
    }

    public int getMaMonAn() {
        return MaMonAn;
    }

    public String getTenMonAn() {
        return TenMonAn;
    }

    public float getGiaTien() {
        return GiaTien;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public int getMaLoaiMon() {
        return MaLoaiMon;
    }

    public void setMaMonAn(int MaMonAn) {
        this.MaMonAn = MaMonAn;
    }

    public void setTenMonAn(String TenMonAn) {
        this.TenMonAn = TenMonAn;
    }

    public void setGiaTien(float GiaTien) {
        this.GiaTien = GiaTien;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public void setMaLoaiMon(int MaLoaiMon) {
        this.MaLoaiMon = MaLoaiMon;
    }
    
    
}

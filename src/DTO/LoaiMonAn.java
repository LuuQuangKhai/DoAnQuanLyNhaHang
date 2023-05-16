/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Luu Quang Khai
 */
public class LoaiMonAn {
    private int MaLoaiMonAn;
    private String TenLoaiMonAn;

    public LoaiMonAn() {
    }

    public LoaiMonAn(int MaLoaiMonAn, String TenLoaiMonAn) {
        this.MaLoaiMonAn = MaLoaiMonAn;
        this.TenLoaiMonAn = TenLoaiMonAn;
    }

    public int getMaLoaiMonAn() {
        return MaLoaiMonAn;
    }

    public String getTenLoaiMonAn() {
        return TenLoaiMonAn;
    }

    public void setMaLoaiMonAn(int MaLoaiMonAn) {
        this.MaLoaiMonAn = MaLoaiMonAn;
    }

    public void setTenLoaiMonAn(String TenLoaiMonAn) {
        this.TenLoaiMonAn = TenLoaiMonAn;
    }
    
    
}

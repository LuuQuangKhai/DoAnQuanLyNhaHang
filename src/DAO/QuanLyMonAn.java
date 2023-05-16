/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.LoaiMonAn;
import DTO.MonAn;
import java.util.ArrayList;

/**
 *
 * @author Luu Quang Khai
 */
public class QuanLyMonAn extends DataConnection{
    
    public ArrayList<LoaiMonAn> layDanhSachLoaiMonAn()
    {
        ArrayList<LoaiMonAn> ds = new ArrayList<>();
        
        try
        {
            open();
            String truyvan = "select * from LoaiMonAn";
            rs = query(truyvan);
            while(rs.next())
            {
                LoaiMonAn x = new LoaiMonAn();
                x.setMaLoaiMonAn(rs.getInt("MaLoaiMonAn"));
                x.setTenLoaiMonAn(rs.getString("TenLoaiMonAn"));
                ds.add(x);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
        close();
        return ds;
    }
    
    public ArrayList<MonAn> layDanhSachMonAn()
    {
        ArrayList<MonAn> ds = new ArrayList<>();
        
        try
        {
            open();
            String truyvan = "select * from MonAn";
            rs = query(truyvan);
            while(rs.next())
            {
                MonAn x = new MonAn();
                x.setMaMonAn(rs.getInt("MaMonAn"));
                x.setTenMonAn(rs.getString("TenMonAn"));
                x.setGiaTien(rs.getFloat("GiaTien"));
                x.setSoLuong(rs.getInt("SoLuong"));
                x.setMaLoaiMon(rs.getInt("MaLoaiMonAn"));
                ds.add(x);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
        close();
        return ds;
    }
    
    public int kiemTraLoaiMonAn(String tenLoaiMonAn)
    {
        int n = -1;
        try
        {
            String truyvan = String.format("select TenLoaiMonAn from LoaiMonAN where TenLoaiMonAn = N'%s'", tenLoaiMonAn);
            open();
            rs = query(truyvan);
            while(rs.next())
            {
                n = 1;
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
        close();
        return n;
    }
    
    public int themLoaiMonAn(String tenLoaiMonAn)
    {
        String truyvan = String.format("insert into LoaiMonAn values(N'%s')", tenLoaiMonAn);
        open();
        
        int n = update(truyvan);
        
        close();
        return n;
    }
    
    public int xoaLoaiMonAn(String tenLoaiMonAn)
    {
        String truyvan = String.format("delete from LoaiMonAn where TenLoaiMonAn = N'%s'",tenLoaiMonAn);
        open();
        
        int n = update(truyvan);
        
        close();
        return n;
    }
    
}

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
    
    public int suaLoaiMonAn(DTO.LoaiMonAn dto)
    {
        String truyvan = String.format("update LoaiMonAn set TenLoaiMonAn = N'%s' where MaLoaiMonAn = %d",dto.getTenLoaiMonAn(),dto.getMaLoaiMonAn());
        open();
        
        int n = update(truyvan);
        
        close();
        return n;
    }
    
    public int kiemTraMonAn(int maMonAn)
    {
        String truyvan = String.format("select MaMonAn from MonAn where MaMonAn = %d", maMonAn);
        open();
        rs = query(truyvan);
        int n = -1;
        try
        {
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
    
    public int themMonAn(DTO.MonAn dto)
    {
        String truyvan = String.format("insert into MonAn values(N'%s',%f,%d,%d)", dto.getTenMonAn(),dto.getGiaTien(),dto.getSoLuong(),dto.getMaLoaiMon());
        open();
        int n = update(truyvan);
        
        close();
        return n;
    }
    
    public int xoaMonAn(int maMonAn)
    {
        String truyvan = String.format("delete from MonAn where MaMonAn = %d", maMonAn);
        open();
        
        int n = update(truyvan);
        close();
        return n;
    }
    
    public int suaMonAn(DTO.MonAn dto)
    {
        String truyvan = String.format("update MonAn set TenMonAn = N'%s', GiaTien = %f, SoLuong = %d, MaLoaiMonAn = %d where MaMonAn = %d",dto.getTenMonAn(),dto.getGiaTien(),dto.getSoLuong(),dto.getMaLoaiMon(),dto.getMaMonAn());
        open();
        
        int n = update(truyvan);
        close();
        return n;
    }
    
    public ArrayList<DTO.MonAn> timKiemMonAn(String tenMonAn)
    {
        ArrayList<DTO.MonAn> ds = new ArrayList<>();
        
        String truyvan = "select * from MonAn where TenMonAn like N'%"+tenMonAn+"%'";
        open();
        rs = query(truyvan);
        
        try
        {
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
        
        
        return ds;
    }
    
}

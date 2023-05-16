/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.ResultSet;

/**
 *
 * @author Luu Quang Khai
 */
public class NhanVien extends DataConnection{
    
    public int kiemTraDangNhap(String tk, String mk)
    {
        int n = -1;
        open();
        try
        {
            String truyvan = String.format("select MaNhanVien from NhanVien where MaNhanVien = '%s' and MatKhau = '%s'", tk,mk);
            rs = query(truyvan);
            
            if(rs.next())
            {
                String ma = rs.getString("MaNhanVien");
                if(ma.equals(tk))
                    return 1;
            }
            return 0;
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
        close();
        
        return n;
    }
}

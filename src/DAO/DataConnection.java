/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;

/**
 *
 * @author Luu Quang Khai
 */
public class DataConnection {
    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String duongdan = "jdbc:sqlserver://LAPTOP-POTNR7PE:1433;databaseName=DBNhaHang;encrypt=false";
    Connection con = null;
    Statement sta = null;
    ResultSet rs = null;
    
    public DataConnection(){}
    
    public void open()
    {
        try
        {
            Class.forName(driver);
//            SQLServerDataSource ds = new SQLServerDataSource();
//            ds.setUser("sa");
//            ds.setPassword("123");
//            ds.setServerName("LAPTOP-POTNR7PE");
//            ds.setPortNumber(1433);
//            ds.setDatabaseName("DBNhaHang");
//            ds.setEncrypt(false);
            con = DriverManager.getConnection(duongdan,"sa","123");
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    
    public void close()
    {
        if(rs != null)
        {
            try
            {
                rs.close();
            }
            catch(Exception ex)
            {
                System.out.println(ex);
            }
        }
        if(sta != null)
        {
            try
            {
                sta.close();
            }
            catch(Exception ex)
            {
                System.out.println(ex);
            }
        }
        if(con != null)
        {
            try
            {
                con.close();
            }
            catch(Exception ex)
            {
                System.out.println(ex);
            }
        }
        
    }
    
    public ResultSet query(String truyvan)
    {
        try
        {
            sta = con.createStatement();
            rs = sta.executeQuery(truyvan);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return rs;
    }
        
    public int update(String truyvan)
    {
        int n = -1;
        try
        {
            sta = con.createStatement();
            n = sta.executeUpdate(truyvan);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return n;
    }
}

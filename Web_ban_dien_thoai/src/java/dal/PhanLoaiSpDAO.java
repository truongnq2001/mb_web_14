/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.PhanLoaiSP;
import model.SanPham;

/**
 *
 * @author daotr
 */
public class PhanLoaiSpDAO extends DBContext{
    public PhanLoaiSP layTheoLoai(String loai){
        ArrayList<SanPham> list = new ArrayList<>();
        
        String sql = "select idSanPham from tblPhanLoai where loai='"+loai+"'";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               
                SanPhamDAO spd = new SanPhamDAO();
                SanPham tmp = spd.layTheoId(rs.getInt("idSanPham"));
                list.add(tmp);
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return new PhanLoaiSP(list,loai);
    }
    
    
    public static void main(String[] args) {
        PhanLoaiSpDAO pld = new PhanLoaiSpDAO();
//        PhanLoaiSP spmoi = pld.layTheoLoai("moi");
//        PhanLoaiSP spnoibat = pld.layTheoLoai("noi bat");
//        PhanLoaiSP sptragop = pld.layTheoLoai("tra gop 0%");
        PhanLoaiSP spgiare = pld.layTheoLoai("de xuat");
//        for(SanPham i:spmoi.getSanPham()){
//            System.out.println(i);
//        }
//        for(SanPham i:spnoibat.getSanPham()){
//            System.out.println(i);
//        }
        for(SanPham i:spgiare.getSanPham()){
            System.out.println(i);
        }
//        for(SanPham i:sptragop.getSanPham()){
//            System.out.println(i);
//        }
    }
}

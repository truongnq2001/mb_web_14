/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import model.DanhGia;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author daotr
 */
public class DanhGiaDAO extends DBContext {

    public void themDanhGia(DanhGia danhGia) {
        String sql = "INSERT INTO tblDanhGia( idNguoiDung, idSanPham, soSao, noiDung, created_at) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, danhGia.getIdNguoiDung());
            ps.setInt(2, danhGia.getIdSanPham());
            ps.setInt(3, danhGia.getSao());
            ps.setString(4, danhGia.getNoiDung());
            ps.setString(5, danhGia.getCreated_at());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public DanhGia layTheoIdDanhGia(int idDanhGia){
        DanhGia tmp = new DanhGia();
        
        String sql = "select * from tblDanhGia where idDanhGia='" + idDanhGia+"'";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                tmp.setIdDanhGia(rs.getInt("idDanhGia"));
                tmp.setIdNguoiDung(rs.getInt("idNguoiDung")); //them nguoi dung bang cach tim nguoi dung trong db
                tmp.setIdSanPham(rs.getInt("idSanPham")); // them san pham bang SanPhamDAO
                tmp.setSao(rs.getInt("soSao"));
                tmp.setNoiDung(rs.getString("noiDung"));
                tmp.setCreated_at(rs.getString("created_at"));         
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return tmp;
    }
    
    
    public ArrayList<DanhGia> layTheoIdNguoiDung(int idNguoiDung){
        ArrayList<DanhGia> list = new ArrayList<>();
        
        String sql = "select * from tblDanhGia where idNguoiDung='" + idNguoiDung +"'";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                DanhGia tmp = new DanhGia();
                tmp.setIdDanhGia(rs.getInt("idDanhGia"));
                tmp.setIdNguoiDung(rs.getInt("idNguoiDung")); //them nguoi dung bang cach tim nguoi dung trong db
                tmp.setIdSanPham(rs.getInt("idSanPham")); // them san pham bang SanPhamDAO
                tmp.setSao(rs.getInt("soSao"));
                tmp.setNoiDung(rs.getString("noiDung"));
                tmp.setCreated_at(rs.getString("created_at"));
                list.add(tmp);
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return list;
    }
    
    
    public ArrayList<DanhGia> layTheoIdSanPham(int idSanPham){
        ArrayList<DanhGia> list = new ArrayList<>();
        
        String sql = "select * from tblDanhGia where idSanPham='" + idSanPham +"'";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                DanhGia tmp = new DanhGia();
                tmp.setIdDanhGia(rs.getInt("idDanhGia"));
                tmp.setIdNguoiDung(rs.getInt("idNguoiDung")); //them nguoi dung bang cach tim nguoi dung trong db
                tmp.setIdSanPham(rs.getInt("idSanPham")); // them san pham bang SanPhamDAO
                tmp.setSao(rs.getInt("soSao"));
                tmp.setNoiDung(rs.getString("noiDung"));
                tmp.setCreated_at(rs.getString("created_at"));
                list.add(tmp);
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return list;
    }
    public static void main(String[] args) {
        DanhGiaDAO a = new DanhGiaDAO();
        ArrayList<DanhGia> b = a.layTheoIdSanPham(1);
        for (DanhGia i:b) {
            System.out.println(i);
        }
    }
}

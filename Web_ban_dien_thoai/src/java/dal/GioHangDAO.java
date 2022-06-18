/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.NguoiDung;
import model.SanPham;

/**
 *
 * @author daotr
 */
public class GioHangDAO extends DBContext {
    public void themSanPhamVaoGioHang(NguoiDung nguoiDung,SanPham sanPham,int soLuong) {
        String sql = "INSERT INTO tblGioHang(idNguoiDung,idSanPham,soluong) VALUES(?,?,?)";
            try {
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, nguoiDung.getIdNguoiDung());
                ps.setInt(2, sanPham.getIdSanPham());
                ps.setInt(3, soLuong);

                ps.executeUpdate();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
    }
    
    
    public void updateSoluong(NguoiDung nguoiDung,SanPham sanPham,int soLuong){
        String sql = "UPDATE tblGioHang SET soluong=? WHERE idNguoiDung=? AND idSanPham=?";
        try {
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, soLuong);
                ps.setInt(2, nguoiDung.getIdNguoiDung());
                ps.setInt(3, sanPham.getIdSanPham());

                ps.executeUpdate();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
    }
}

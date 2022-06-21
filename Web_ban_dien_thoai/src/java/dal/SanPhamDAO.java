/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import model.HinhAnh;
import model.SanPham;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.DanhGia;


/**
 *
 * @author daotr
 */
public class SanPhamDAO extends DBContext{
    
    
    
    public void themSanPham(SanPham sanPham) {
        String sql = "INSERT INTO tblSanPham( tenSP, hang, pin, ram, rom, cpu, ktManHinh, cameraTruoc, cameraSau, gia, created_at, updated_at) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sanPham.getTenSP());
            ps.setString(2, sanPham.getHangDT());
            ps.setInt(3, sanPham.getPin());
            ps.setInt(4, sanPham.getRam());
            ps.setInt(5, sanPham.getRom());
            ps.setString(6, sanPham.getCpu());
            ps.setString(7, sanPham.getKtManHinh());
            ps.setString(8, sanPham.getCameraTruoc());
            ps.setString(9, sanPham.getCameraSau());
            ps.setInt(10, sanPham.getGia());
            ps.setString(11, sanPham.getCreated_at());
            ps.setString(12, sanPham.getUpdated_at());
            
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        // lay du lieu anh tu san pham va chen vao tbl anh 
        HinhAnhDAO t = new HinhAnhDAO();
        for(HinhAnh hinhAnh:sanPham.getHinhAnh()){
            t.themHinhAnh(hinhAnh);
        }
        DanhGiaDAO t1 = new DanhGiaDAO();
        for(DanhGia danhGia:sanPham.getDanhGia()){
            t1.themDanhGia(danhGia);
        }
    }
    public ArrayList<SanPham> layTatCa(String thuonghieu, String sapxep, String khuyenmai, String gia){
        ArrayList<SanPham> list = new ArrayList<>();
        
        String sql = "select * from [Web_ban_dien_thoai].[dbo].[tblSanPham]";
        sql += " inner join tblPhanLoai on tblSanPham.idSanPham = tblPhanLoai.idSanPham";
       
        if (gia != null){
            if(gia.equals("duoi2trieu")){
                sql += " where gia < 2000000";
            }
            if(gia.equals("tu2den4trieu")){
                sql += " where gia >= 2000000 and gia < 4000000";
            }
            if(gia.equals("tu4den7trieu")){
                sql += " where gia >= 4000000 and gia < 7000000";
            }
            if(gia.equals("tu7den13trieu")){
                sql += " where gia >= 7000000 and gia < 13000000";
            }
            if(gia.equals("tren13trieu")){
                sql += " where gia >= 13000000";
            }
        }
  
        if (gia == null && khuyenmai != null){
            if(khuyenmai.equals("tragop")){
                sql += " where loai = '" + khuyenmai +"'";
            }
            if(khuyenmai.equals("giamgia")){
                sql += " where loai = '" + khuyenmai +"'";
            }
            if(khuyenmai.equals("moiramat")){
                sql += " where loai = '" + khuyenmai +"'";
            } 
        }
        
        if (gia != null && khuyenmai != null){
            if(khuyenmai.equals("tragop")){
                sql += " and loai = '" + khuyenmai +"'";
            }
            if(khuyenmai.equals("giamgia")){
                sql += " and loai = '" + khuyenmai +"'";
            }
            if(khuyenmai.equals("moiramat")){
                sql += " and loai = '" + khuyenmai +"'";
            } 
        }
       
        if ((gia == null || khuyenmai == null) && thuonghieu != null){
            sql += " where hang = '" + thuonghieu +"'";
        } 
        
        if ((khuyenmai != null || gia != null) && thuonghieu != null){
            sql += " and hang = '" + thuonghieu +"'";
        } 
        
        if (sapxep != null){
            if(sapxep.equals("giatangdan")){
                sql += " order by gia ASC";
            }
            if(sapxep.equals("giagiamdan")){
                sql += " order by gia DESC";
            }
        }
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                SanPham tmp = new SanPham();
                tmp.setIdSanPham(rs.getInt("idSanPham"));
                tmp.setTenSP(rs.getString("tenSP"));
                tmp.setHangDT(rs.getString("hang"));
                tmp.setPin(rs.getInt("pin"));
                tmp.setRam(rs.getInt("ram"));
                tmp.setRom(rs.getInt("rom"));
                tmp.setKtManHinh(rs.getString("ktManHinh"));
                tmp.setCpu(rs.getString("cpu"));
                tmp.setCameraTruoc(rs.getString("cameraTruoc"));
                tmp.setCameraSau(rs.getString("cameraSau"));
                tmp.setGia(rs.getInt("gia"));
                HinhAnhDAO t = new HinhAnhDAO(); 
                tmp.setHinhAnh(t.layTheoIdSanPham(tmp.getIdSanPham())); // them array list hinh anh tu HinhAnhDAO
                tmp.setCreated_at(rs.getString("created_at"));
                tmp.setUpdated_at(rs.getString("updated_at"));
                DanhGiaDAO t1 = new DanhGiaDAO(); 
                tmp.setDanhGia(t1.layTheoIdSanPham(tmp.getIdSanPham()));
                tmp.setHienthiKM(rs.getString("hienthiKM"));
                list.add(tmp);
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return list;
    }
    
    public SanPham layTheoId(int idSanPham) {
        String sql = "select * from tblSanPham where idSanPham='" + idSanPham +"'";
        SanPham tmp = new SanPham();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                tmp.setIdSanPham(rs.getInt("idSanPham"));
                tmp.setTenSP(rs.getString("tenSP"));
                tmp.setHangDT(rs.getString("hang"));
                tmp.setPin(rs.getInt("pin"));
                tmp.setRam(rs.getInt("ram"));
                tmp.setRom(rs.getInt("rom"));
                tmp.setCpu(rs.getString("cpu"));
                tmp.setKtManHinh(rs.getString("ktManHinh"));
                tmp.setCameraTruoc(rs.getString("cameraTruoc"));
                tmp.setCameraSau(rs.getString("cameraSau"));
                tmp.setGia(rs.getInt("gia"));
                HinhAnhDAO t = new HinhAnhDAO(); 
                tmp.setHinhAnh(t.layTheoIdSanPham(rs.getInt("idSanPham"))); // them array list hinh anh tu HinhAnhDAO
                DanhGiaDAO t1 = new DanhGiaDAO(); 
                tmp.setDanhGia(t1.layTheoIdSanPham(rs.getInt("idSanPham")));
                tmp.setCreated_at(rs.getString("created_at"));
                tmp.setUpdated_at(rs.getString("updated_at"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return tmp;
    }
    
    public ArrayList<SanPham> layTatCaTheoMucGia(int giaLoc){
        ArrayList<SanPham> list = new ArrayList<>();
        
        String sql = "select * from tblSanPham where gia<="+Integer.toString(giaLoc);
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                SanPham tmp = new SanPham();
                tmp.setIdSanPham(rs.getInt("idSanPham"));
                tmp.setTenSP(rs.getString("tenSP"));
                tmp.setHangDT(rs.getString("hang"));
                tmp.setPin(rs.getInt("pin"));
                tmp.setRam(rs.getInt("ram"));
                tmp.setRom(rs.getInt("rom"));
                tmp.setCpu(rs.getString("cpu"));
                tmp.setKtManHinh(rs.getString("ktManHinh"));
                tmp.setCameraTruoc(rs.getString("cameraTruoc"));
                tmp.setCameraSau(rs.getString("cameraSau"));
                tmp.setGia(rs.getInt("gia"));
                HinhAnhDAO t = new HinhAnhDAO(); 
                tmp.setHinhAnh(t.layTheoIdSanPham(tmp.getIdSanPham())); // them array list hinh anh tu HinhAnhDAO
                
                
                DanhGiaDAO t1 = new DanhGiaDAO(); 
                tmp.setDanhGia(t1.layTheoIdSanPham(tmp.getIdSanPham()));
                
                
                tmp.setCreated_at(rs.getString("created_at"));
                tmp.setUpdated_at(rs.getString("updated_at"));
                list.add(tmp);
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return list;
    }
    
    public ArrayList<SanPham> layTatCaTheoHang(String hang){
        ArrayList<SanPham> list = new ArrayList<>();
        
        String sql = "select * from tblSanPham where hang='"+hang+"'";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                SanPham tmp = new SanPham();
                tmp.setIdSanPham(rs.getInt("idSanPham"));
                tmp.setTenSP(rs.getString("tenSP"));
                tmp.setHangDT(rs.getString("hang"));
                tmp.setPin(rs.getInt("pin"));
                tmp.setRam(rs.getInt("ram"));
                tmp.setRom(rs.getInt("rom"));
                tmp.setCpu(rs.getString("cpu"));
                tmp.setKtManHinh(rs.getString("ktManHinh"));
                tmp.setCameraTruoc(rs.getString("cameraTruoc"));
                tmp.setCameraSau(rs.getString("cameraSau"));
                tmp.setGia(rs.getInt("gia"));
                HinhAnhDAO t = new HinhAnhDAO(); 
                tmp.setHinhAnh(t.layTheoIdSanPham(tmp.getIdSanPham())); // them array list hinh anh tu HinhAnhDAO
                DanhGiaDAO t1 = new DanhGiaDAO(); 
                tmp.setDanhGia(t1.layTheoIdSanPham(tmp.getIdSanPham()));
                tmp.setCreated_at(rs.getString("created_at"));
                tmp.setUpdated_at(rs.getString("updated_at"));
                list.add(tmp);
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return list;
    }
   
}

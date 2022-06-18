/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import model.NguoiDung;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author daotr
 */
public class NguoiDungDAO extends DBContext {

    public void themNguoiDung(NguoiDung nguoiDung) {
        String sql = "INSERT INTO tblNguoiDung(mucQuyen,  tenND, taiKhoan, matKhau,  email, sdt, created_at, updated_at) VALUES(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, nguoiDung.getMucQuyen());
            ps.setString(2, nguoiDung.getTenND());
            ps.setString(3, nguoiDung.getTaiKhoan());
            ps.setString(4, nguoiDung.getMatKhau());
            ps.setString(5, nguoiDung.getEmail());
            ps.setString(6, nguoiDung.getSdt());
            
            
            SimpleDateFormat df = new SimpleDateFormat("mm:HH dd/MM/yyyy");
            ps.setString(7, df.format(new Date()));
            ps.setString(8, df.format(new Date()));

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<NguoiDung> layTatCa() {
        ArrayList<NguoiDung> list = new ArrayList<>();

        String sql = "select * from tblNguoiDung";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NguoiDung tmp = new NguoiDung();
                tmp.setIdNguoiDung(rs.getInt("idNguoiDung"));
                tmp.setMucQuyen(rs.getInt("mucQuyen"));
                tmp.setTenND(rs.getString("tenND"));
                tmp.setTaiKhoan(rs.getString("taiKhoan"));
                tmp.setMatKhau(rs.getString("matKhau"));
                tmp.setEmail(rs.getString("email"));
                tmp.setSdt(rs.getString("sdt"));
                tmp.setCreated_at(rs.getString("created_at"));
                tmp.setUpdated_at(rs.getString("updated_at"));
                list.add(tmp);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }

    public NguoiDung layTheoId(int idNguoiDung) {
        String sql = "select * from tblNguoiDung where idNguoiDung='" + idNguoiDung +"'";
        NguoiDung tmp = new NguoiDung();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){   
                tmp.setIdNguoiDung(rs.getInt("idNguoiDung"));
                tmp.setTenND(rs.getString("tenND"));
                tmp.setTaiKhoan(rs.getString("taiKhoan"));
                tmp.setMatKhau(rs.getString("matKhau"));
                tmp.setEmail(rs.getString("email"));
                tmp.setSdt(rs.getString("sdt"));
                tmp.setMucQuyen(rs.getInt("mucQuyen"));
                tmp.setCreated_at(rs.getString("created_at"));
                tmp.setUpdated_at(rs.getString("updated_at"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return tmp;
    }
    
    public NguoiDung check(String user,String pass){
        String sql = "select * from tblNguoiDung where taiKhoan=? and matKhau=?";
        try{
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1,user);
            st.setString(2,pass);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                return new NguoiDung(rs.getInt("idNguoiDung"),rs.getString("tenND"), user, pass, rs.getString("email"),rs.getString("sdt"),rs.getInt("mucQuyen"),rs.getString("created_at"), rs.getString("updated_at"));
            }
        } catch(SQLException e){
            
        }
        return null;
    }
    public static void main(String[] args) {
        NguoiDungDAO a= new NguoiDungDAO();
        NguoiDung b =a.check("PhucDT12","dt123456");
        System.out.println(b);
    }
}

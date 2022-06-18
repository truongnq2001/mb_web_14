/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author daotr
 */
public class GioHang {
    private NguoiDung nguoiDung;
    private SanPham sanPham;

    public GioHang() {
    }

    public GioHang(NguoiDung nguoiDung, SanPham sanPham) {
        this.nguoiDung = nguoiDung;
        this.sanPham = sanPham;
    }

    public NguoiDung getNguoiDung() {
        return nguoiDung;
    }

    public void setNguoiDung(NguoiDung nguoiDung) {
        this.nguoiDung = nguoiDung;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }
    
    
    
}
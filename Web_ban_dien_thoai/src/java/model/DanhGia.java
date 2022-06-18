/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;



/**
 *
 * @author daotr
 */
public class DanhGia {
    private int idDanhGia;
    private int idNguoiDung;
    private int idSanPham;
    private int sao;
    private String noiDung;
    private String created_at;

    public DanhGia() {
    }

    public DanhGia(int idDanhGia, int idNguoiDung, int idSanPham, int sao, String noiDung, String created_at) {
        this.idDanhGia = idDanhGia;
        this.idNguoiDung = idNguoiDung;
        this.idSanPham = idSanPham;
        this.sao = sao;
        this.noiDung = noiDung;
        this.created_at = created_at;
    }

    

    public int getIdDanhGia() {
        return idDanhGia;
    }

    public void setIdDanhGia(int idDanhGia) {
        this.idDanhGia = idDanhGia;
    }

    public int getIdNguoiDung() {
        return idNguoiDung;
    }

    public void setIdNguoiDung(int idNguoiDung) {
        this.idNguoiDung = idNguoiDung;
    }

    public int getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(int idSanPham) {
        this.idSanPham = idSanPham;
    }

    public int getSao() {
        return sao;
    }

    public void setSao(int sao) {
        this.sao = sao;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "DanhGia{" + "idDanhGia=" + idDanhGia + ", idNguoiDung=" + idNguoiDung + ", idSanPham=" + idSanPham + ", sao=" + sao + ", noiDung=" + noiDung + ", created_at=" + created_at + '}';
    }

    

    
    
    
    
}
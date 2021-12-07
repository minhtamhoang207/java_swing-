package model;

import java.io.Serializable;

public class BookModel implements Serializable {
    private int ma;
    private String ten, tacGia, chuyenNganh;
    private int soLuong;
    private static int sma = 10000;

    public BookModel(){
        ma = sma++;
    }
    public BookModel(int ma, String ten, String tacGia, String chuyenNganh, int soLuong) {
        this.ma = ma;
        this.ten = ten;
        this.tacGia = tacGia;
        this.chuyenNganh = chuyenNganh;
        this.soLuong = soLuong;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        BookModel.sma = sma;
    }

    public Object[] toObjects(){
        return new Object[]{
          getMa(), getTen(), getTacGia(), getChuyenNganh(), getSoLuong()
        };
    }
}

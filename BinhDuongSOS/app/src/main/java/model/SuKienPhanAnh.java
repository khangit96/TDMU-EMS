package model;

import java.util.List;

public class SuKienPhanAnh {
    public String thoiGian;
    public String thoiGianNgan;
    public double kinhDo;
    public double viDo;
    public String moTa;
    public String loaiPhanAnh;
    List<URLData> urlData;
    public String tinhTrang;
    public String viTri;

    public SuKienPhanAnh(String thoiGian, String thoiGianNgan, double kinhDo, double viDo, String moTa, String loaiPhanAnh, List<URLData> urlData, String viTri, String tinhTrang) {
        this.thoiGian = thoiGian;
        this.thoiGianNgan = thoiGianNgan;
        this.loaiPhanAnh = loaiPhanAnh;
        this.kinhDo = kinhDo;
        this.viDo = viDo;
        this.moTa = moTa;
        this.urlData = urlData;
        this.tinhTrang=tinhTrang;
        this.viTri=viTri;
    }
}
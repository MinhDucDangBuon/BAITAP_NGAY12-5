package bai2;

import java.util.Scanner;

class giaoDich{
    private String maGiaoDich;
    private int soLuong;
    private int ngayGiaoDich;
    private double donGia;
    private double thanhTien;

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(int ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
    public giaoDich(){
        maGiaoDich = "";
        soLuong = 0;
        ngayGiaoDich = 0;
        donGia = 0;
        thanhTien = 0;
    }
    public giaoDich(String maGiaoDich,int soLuong, int ngayGiaoDich, double donGia, double thanhTien){
        this.maGiaoDich = maGiaoDich;
        this.soLuong = soLuong;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }
    public void inPut(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma giao dich : ");
        maGiaoDich = scanner.nextLine();
        System.out.println("Nhap so luong : ");
        soLuong = scanner.nextInt();
        System.out.println("Nhap ngay giao dich : ");
        ngayGiaoDich = scanner.nextInt();
        System.out.println("Nhap don gia : ");
        donGia = scanner.nextDouble();
    }
    public void outPut(){
        System.out.println("Ma giao dich : " + maGiaoDich);
        System.out.println("So luong : " + soLuong);
        System.out.println("Ngay giao dich : " + ngayGiaoDich);
        System.out.println("Nhap don gia : " + donGia);
    }
}
class giaoDichVang extends giaoDich{
    private String loaiVang;

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }
    public giaoDichVang(){
        super();
        loaiVang = "";
    }
    public giaoDichVang(String maGiaoDich,int soLuong, int ngayGiaoDich, double donGia, double thanhTien, String loaiVang){
        super(maGiaoDich, soLuong, ngayGiaoDich, donGia, thanhTien);
        this.loaiVang = loaiVang;
    }
    @Override
    public void inPut(){
        super.inPut();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap loai vang : ");
        loaiVang = scanner.nextLine();
    }
    @Override
    public void outPut(){
        super.outPut();
        System.out.println("Loai vang : " + loaiVang);
    }
}
class giaoDichTienTe extends giaoDich{
    private double tyGia;
    private String loaiTienTe;

    public double getTyGia() {
        return tyGia;
    }

    public void setTyGia(double tyGia) {
        this.tyGia = tyGia;
    }

    public String getLoaiTienTe() {
        return loaiTienTe;
    }

    public void setLoaiTienTe(String loaiTienTe) {
        this.loaiTienTe = loaiTienTe;
    }
    public giaoDichTienTe(){
        super();
        tyGia = 0;
        loaiTienTe = "";
    }
    public giaoDichTienTe(String maGiaoDich,int soLuong, int ngayGiaoDich, double donGia, double thanhTien,double tyGia, String loaiTienTe){
        super(maGiaoDich, soLuong, ngayGiaoDich, donGia, thanhTien);
        this.tyGia = tyGia;
        this.loaiTienTe = loaiTienTe;
    }
}
class quanLyDanhSach{
    giaoDich[] danhSachGiaoDich;
    public quanLyDanhSach(){
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhap n : ");
        n = scanner.nextInt();
        danhSachGiaoDich = new giaoDich[n];
    }

    public void nhapThongTin(){
        System.out.println("Nhap thong tin cho " + danhSachGiaoDich.length + " giao dich : ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < danhSachGiaoDich.length; i++){
            System.out.println("Nhap thong tin cho giao dich thu " + (i+1));
            
        }
    }
}
public class Main {
}

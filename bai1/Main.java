package bai1;
import java.util.Scanner;

class chuyenXe {
    private String maChuyenXe;
    private String tenTaiXe;
    private int soXe;
    private double doanhThu;

    public String getMaChuyenXe() {
        return maChuyenXe;
    }

    public void setMaChuyenXe(String maChuyenXe) {
        this.maChuyenXe = maChuyenXe;
    }

    public String getTenTaiXe() {
        return tenTaiXe;
    }

    public void setTenTaiXe(String tenTaiXe) {
        this.tenTaiXe = tenTaiXe;
    }

    public int getSoXe() {
        return soXe;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public chuyenXe() {
        maChuyenXe = "";
        tenTaiXe = "";
        soXe = 0;
        doanhThu = 0;
    }

    public chuyenXe(String maChuyenXe, String tenTaiXe, int soXe, double doanhThu) {
        this.maChuyenXe = maChuyenXe;
        this.tenTaiXe = tenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public void inPut() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma chuyen xe : ");
        maChuyenXe = scanner.nextLine();
        System.out.println("Nhap ten tai xe : ");
        tenTaiXe = scanner.nextLine();
        System.out.println("Nhap so xe : ");
        soXe = scanner.nextInt();
        System.out.println("Nhap doanh thu : ");
        doanhThu = scanner.nextDouble();
    }

    public void outPut() {
        System.out.println("Ma chuyen xe : " + maChuyenXe);
        System.out.println("Ten tai xe  :" + tenTaiXe);
        System.out.println("So xe  : " + soXe);
        System.out.println("Doanh thu : " + doanhThu);
    }
}

class NgoaiThanh extends chuyenXe {
    private String noiDen;
    private int soNgay;

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }

    public NgoaiThanh() {
        super();
        noiDen = "";
        soNgay = 0;
    }

    public NgoaiThanh(String maChuyenXe, String tenTaiXe, int soXe, double doanhThu, String noiDen, int soNgay) {
        super(maChuyenXe, tenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgay = soNgay;
    }

    @Override
    public void inPut() {
        super.inPut();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap noi den : ");
        noiDen = scanner.nextLine();
        System.out.println("Nhap so ngay : ");
        soNgay = scanner.nextInt();
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Noi den : " + noiDen);
        System.out.println("So ngay : " + soNgay);
    }
}

class noiThanh extends chuyenXe {
    private double soKm;
    private int soTuyen;

    public double getSoKm() {
        return soKm;
    }

    public void setSoKm(double soKm) {
        this.soKm = soKm;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public noiThanh() {
        super();
        soKm = 0;
        soTuyen = 0;
    }

    public noiThanh(String maChuyenXe, String tenTaiXe, int soXe, double doanhThu, double soKm, int soTuyen) {
        super(maChuyenXe, tenTaiXe, soXe, doanhThu);
        this.soKm = soKm;
        this.soTuyen = soTuyen;
    }

    @Override
    public void inPut() {
        Scanner scanner = new Scanner(System.in);
        super.inPut();
        System.out.println("Nhap so KM : ");
        soKm = scanner.nextDouble();
        System.out.println("Nhap so tuyen : ");
        soTuyen = scanner.nextInt();
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("So KM : " + soKm);
        System.out.println("So tuyen : " + soTuyen);
    }
}

class quanLyChuyenXe {
    chuyenXe[] danhsachchuyenxe;

    public quanLyChuyenXe() {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        danhsachchuyenxe = new chuyenXe[n];
    }

    public void nhapThongTin() {
        System.out.println("Nhap thong tin cho " + danhsachchuyenxe.length + " chuyen xe: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < danhsachchuyenxe.length; i++) {
            System.out.println("Nhap thong tin xe thu " + (i + 1));
            System.out.println("Chon loai chuyen xe (1 - Ngoai thanh, 2 - Noi thanh): ");
            int loaiXe = scanner.nextInt();
            scanner.nextLine();
            chuyenXe xe;
            if (loaiXe == 1) {
                NgoaiThanh xeNgoaiThanh = new NgoaiThanh();
                xeNgoaiThanh.inPut();
                xe = xeNgoaiThanh;
            } else {
                noiThanh xeNoiThanh = new noiThanh();
                xeNoiThanh.inPut();
                xe = xeNoiThanh;
            }
            danhsachchuyenxe[i] = xe;
        }
    }

    public void xuatThongTin() {
        System.out.println("THONG TIN XE");
        for (int i = 0; i < danhsachchuyenxe.length; i++) {
            danhsachchuyenxe[i].outPut();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        quanLyChuyenXe ql = new quanLyChuyenXe();
        ql.nhapThongTin();
        ql.xuatThongTin();
    }
}
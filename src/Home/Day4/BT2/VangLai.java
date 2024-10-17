package Day4.BT2;

import java.util.Scanner;

public class VangLai extends KhachHang{
    private double phiThamGia;

    public VangLai() {
        super();
    }

    public VangLai(String maPassport, String hoTen, double tienCuoc, double phiThamGia) {
        super(maPassport, hoTen, tienCuoc);
        this.phiThamGia = phiThamGia;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phi tham gia: ");
        phiThamGia = sc.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        toString();
    }

    @Override
    public String toString() {
        return "VangLai{" +
                "phiThamGia=" + phiThamGia +
                '}';
    }

    @Override
    public double tinhTienThang() {
        return tienCuoc - phiThamGia;
    }
}

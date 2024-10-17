package Day4.BT2;

import java.util.Scanner;

public class ThanhVien extends KhachHang{
    private double tiLeThuong;

    public ThanhVien() {
        super();
    }

    public ThanhVien(String maPassport, String hoTen, double tienCuoc, double tiLeThuong) {
        super(maPassport, hoTen, tienCuoc);
        this.tiLeThuong = tiLeThuong;
    }

    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ti le thuong: ");
        tiLeThuong = sc.nextDouble();
    }

    public void xuat() {
        super.xuat();
        toString();
    }

    @Override
    public String toString() {
        return "ThanhVien{" +
                "tiLeThuong=" + tiLeThuong +
                '}';
    }

    public  double tinhTienThang() {
        return tienCuoc * tiLeThuong;
    }
}

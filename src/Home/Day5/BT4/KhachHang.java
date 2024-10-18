package Day5.BT4;

import java.util.Scanner;

public abstract class KhachHang {
      String maPassport;
      String hoTen;
      double tienCuoc;

     public KhachHang() {
     }


     public KhachHang(String maPassport, String hoTen, double tienCuoc) {
         this.maPassport = maPassport;
         this.hoTen = hoTen;
         this.tienCuoc = tienCuoc;
     }

     public double getTienCuoc() {
         return tienCuoc;
     }

    public void setTienCuoc(double tienCuoc) {
         this.tienCuoc = tienCuoc;
    }

    public void nhap() {
         Scanner sc = new Scanner(System.in) ;
         System.out.println("Nhap thong tin khach hang:");
         System.out.println("PassPort : ");
         this.maPassport = sc.next();
         System.out.println("Ho Ten : ");
         this.hoTen = sc.next();
         System.out.println("Tien Cuoc");
         this.tienCuoc =sc.nextDouble();
                       }
    public  void xuat() {
        System.out.println(this);
    }

    public String toString() {
        return "KhachHang{" +
                "maPassport='" + maPassport + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tienCuoc=" + tienCuoc +
                '}';
        }

    public abstract double tinhTienThang();
}

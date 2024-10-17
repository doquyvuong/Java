package Day4.BT2;

import java.util.Scanner;

public class KhachHang {
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
         maPassport = sc.next();
         System.out.println("Ho Ten : ");
         hoTen = sc.next();
         System.out.println("Tien Cuoc");
         tienCuoc =sc.nextDouble();
                       }
    public  void xuat() {
         toString();
    }

    public String toString() {
        return "KhachHang{" +
                "maPassport='" + maPassport + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tienCuoc=" + tienCuoc +
                '}';
        }

    public double tinhTienThang() {
        return 0;
    }
}

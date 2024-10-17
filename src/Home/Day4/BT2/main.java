package Day4.BT2;

import java.util.Scanner;

public class main {
    int maxKH=0;
    int SLKH =0;
    KhachHang[] danhsachKH;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int chon;
        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Thêm khách thành viên    ");
            System.out.println("2. Thêm khách vãng lai");
            System.out.println("3. Hiển thị toàn bộ danh sách ( bao gồm tiền thắng cược )");
            System.out.println("4. Thoát chương trình");
            chon = sc.nextInt();
            switch (chon){
                case 1:
                    ThanhVien thanhvien = new ThanhVien();
                    thanhvien.nhap();
                    //??????
                    break;
                case 2: break;
                case 3: break;
                case 4: break;
                default:
                    System.out.println("---------Moi chon lai--------");
            }

        }while (chon != 4);

    }

    public void gioihan(int maxKH) {
        this.maxKH = maxKH;
        danhsachKH =new KhachHang[maxKH];
    }

    public void add(KhachHang newKH) {
        danhsachKH[maxKH++]= newKH;
    }
}

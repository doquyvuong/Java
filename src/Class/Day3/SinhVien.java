package Day3;

import java.util.Scanner;

public class SinhVien {
    Scanner sc = new Scanner(System.in);
    int ID;
    String HovaTen;
    double Toan, Van, Anh;

    void nhap() {
        System.out.println("ID");
        ID = sc.nextInt();
        System.out.println("Name");
        HovaTen = sc.next();

        System.out.println("Diem");
        Toan = sc.nextDouble();
        Van = sc.nextDouble();
        Anh = sc.nextDouble();
    }

    void xuat() {
        System.out.println("ID: " + ID);
        System.out.println("Ho va ten: " + HovaTen);
        System.out.println("Diem trung binh = " + (Toan + Anh + Van) / 3);
    }

}


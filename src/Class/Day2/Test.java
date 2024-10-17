package Day2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner date  = new Scanner(System.in) ;
        int ngay,thang,nam;
        System.out.println("Nhap ngay,thang,nam : ");
        ngay = date.nextInt();
        thang = date.nextInt();
        nam = date.nextInt();
        System.out.println("ngay " + ngay + " thang " + thang + " nam " + nam);
    }
}

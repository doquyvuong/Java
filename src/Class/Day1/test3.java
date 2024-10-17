package Day1;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        int x;
        System.out.println("Nhap x : ");
        x = so.nextInt();
        double tinhtoan = 3*Math.pow(x,3) - 5*Math.pow(x,2) +6;
        System.out.println("Ket qua la : " + tinhtoan);
    }
}

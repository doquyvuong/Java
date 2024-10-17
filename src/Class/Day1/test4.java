package Day1;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        float x;
        System.out.println("nhap x : ");
        x = so.nextInt();
        double tinhtoan = Math.sqrt(x);
        System.out.println("Can bac 2 cua x : " + tinhtoan );
    }
}

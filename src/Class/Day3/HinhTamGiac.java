package Day3;

import java.util.Scanner;

public class HinhTamGiac {
    Scanner sc = new Scanner(System.in);
    int ma,mb,mc;

    public HinhTamGiac() {
    }
    public HinhTamGiac(int ma,int mb,int mc){
        if(ma>0 && mb>0 && mc>0){
            if(ma+mb>mc || ma+mc >mb || mb+mc>ma){
                this.ma=ma;
                this.mb=mb;
                this.mc=mc;
            }else {
                System.out.println("3 gia tri khong tao thanh 1 tam giac");
                this.ma= this.mb= this.mc=0;
            }
        }
        if(ma<0){
            System.out.println("So vua nhap khong phai so duong nen duoc gan =0");
            this.ma=0;
        }
        if(mb<0){
            System.out.println("So vua nhap khong phai so duong nen duoc gan =0");
            this.mb=0;
        }
        if(mc<0){
            System.out.println("So vua nhap khong phai so duong nen duoc gan =0");
            this.mc=0;
        }

    }
    int getCanhA() {
        return ma;
    }
    void setCanhA(int canh){
        if(canh>0 && mb>0 && mc>0){
            if(canh+mb>mc || canh+mc >mb || mb+mc>canh){
                this.ma=canh;
                this.mb=mb;
                this.mc=mc;
            }else {
                System.out.println("3 gia tri khong tao thanh 1 tam giac");
                this.ma= this.mb= this.mc=0;
            }
        }else if(canh<0){
            System.out.println("So vua nhap khong phai so duong nen duoc gan =0");
            this.ma=0;
        }else if(mb<0){
            System.out.println("So vua nhap khong phai so duong nen duoc gan =0");
            this.mb=0;
        }else if(mc<0){
            System.out.println("So vua nhap khong phai so duong nen duoc gan =0");
            this.mc=0;
        }
    }
    int getCanhB() {
        return mb;
    }
    void setCanhB(int canh){
        if(ma>0 && canh>0 && mc>0){
            if(ma+canh>mc || ma+mc >canh || canh+mc>ma){
                this.ma=ma;
                this.mb=canh;
                this.mc=mc;
            }else {
                System.out.println("3 gia tri khong tao thanh 1 tam giac");
                this.ma= this.mb= this.mc=0;
            }
        }else if(ma<0){
            System.out.println("So vua nhap khong phai so duong nen duoc gan =0");
            this.ma=0;
        }else if(canh<0){
            System.out.println("So vua nhap khong phai so duong nen duoc gan =0");
            this.mb=0;
        }else if(mc<0){
            System.out.println("So vua nhap khong phai so duong nen duoc gan =0");
            this.mc=0;
        }
    }
    int getCanhC() {
        return mc;
    }
    void setCanhC(int canh){
        if(ma>0 && mb>0 && canh>0){
            if(ma+mb>canh || ma+canh >mb || mb+canh>ma){
                this.ma=ma;
                this.mb=mb;
                this.mc=canh;
            }else {
                System.out.println("3 gia tri khong tao thanh 1 tam giac");
                this.ma= this.mb= this.mc=0;
            }
        }else if(ma<0){
            System.out.println("So vua nhap khong phai so duong nen duoc gan =0");
            this.ma=0;
        }else if(mb<0){
            System.out.println("So vua nhap khong phai so duong nen duoc gan =0");
            this.mb=0;
        }else if(canh<0){
            System.out.println("So vua nhap khong phai so duong nen duoc gan =0");
            this.mc=0;
        }
    }

    boolean CheckTamGiac(){
    return true;
    }

}


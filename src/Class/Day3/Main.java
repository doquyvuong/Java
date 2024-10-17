package Day3;

public class Main {
    public static void main(String[] args) {
//       SinhVien sinhVien=new SinhVien();
//       sinhVien.nhap();
//       sinhVien.xuat();


        HinhTamGiac HTG = new HinhTamGiac(3,4,5);
        System.out.println("Canh A: " + HTG.getCanhA());
        HTG.setCanhA(10);
        System.out.println("Canh A: " + HTG.getCanhA());
    }
}
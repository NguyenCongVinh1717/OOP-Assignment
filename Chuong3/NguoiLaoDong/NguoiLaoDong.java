
package NguoiLaoDong;

import java.util.Scanner;

public abstract class NguoiLaoDong {
     private String hoTen;
    private String diaChi;

    public NguoiLaoDong() {
    }

    public NguoiLaoDong(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        this.hoTen = sc.nextLine();

        System.out.println("Nhap dia chi: ");
        this.diaChi = sc.nextLine();
    }

    public abstract double tinhLuong();

    public void inThongTin() {
        System.out.println("Ho ten:"+"\t" + this.hoTen + "\t" +"Dia chi:" +"\t"+ this.diaChi +"\t"+"Luong thang:"+"\t"+this.tinhLuong());
    }

}


package Chuong3.QuanLiGiaoVien;

import java.util.Scanner;

public class GVCoHuu extends GiangVien {
    protected double luongCoBan;
    protected double heSoLuong;
    protected int thamNien;
    protected double phuCap;

    public GVCoHuu() {
    }

    public GVCoHuu(String hoTen, String diaChi, String loaiGiangVien, double luongCoBan, double heSoLuong, int thamNien) {
        super(hoTen, diaChi, loaiGiangVien);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        if (this.thamNien < 5) {
            this.phuCap = 0 * this.luongCoBan;
        } else if (this.thamNien >= 5) {
            this.phuCap = (this.thamNien * this.luongCoBan) / 100;
        }
    }

    public String getHoTen() {
        return hoTen;
    }
    

    @Override

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.println("Nhap luong co ban: ");
        this.luongCoBan = sc.nextDouble();

        System.out.println("Nhap he so luong: ");
        this.heSoLuong = sc.nextDouble();

        System.out.println("Nhap tham nien: ");
        this.thamNien = sc.nextInt();

        if (this.thamNien < 5) {
            this.phuCap = 0 * this.luongCoBan;
        } else if (this.thamNien >= 5) {
            this.phuCap = (this.thamNien * this.luongCoBan) / 100;
        }

        sc.nextLine();

    }

    @Override
    public double tinhLuong() {
        double luong = this.luongCoBan * this.heSoLuong + this.phuCap;
        return luong;
    }
   

}

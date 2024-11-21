
package Chuong3.QuanLiGiaoVien;

import java.util.Scanner;

    public abstract class GiangVien {
    protected String hoTen;
    protected String diaChi;
    protected String loaiGiangVien;

    public GiangVien() {
    }

    public GiangVien(String hoTen, String diaChi, String loaiGiangVien) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiGiangVien = loaiGiangVien;
    }
    public void nhapThongTin(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten: ");
        this.hoTen=sc.nextLine();
        
        System.out.println("Nhap dia chi: ");
        this.diaChi=sc.nextLine();
        
        System.out.println("Nhap loai giang vien: ");
        this.loaiGiangVien=sc.nextLine();
        
        
    }
    public abstract double tinhLuong();
    public void inThongTin(){
        System.out.println("Ho ten: "+this.hoTen+"\t"+"Dia chi: "+this.diaChi+"\t"+"Loai giang vien: "+this.loaiGiangVien+"\t"+"Luong thang: "+this.tinhLuong()+"\t");
    }

}

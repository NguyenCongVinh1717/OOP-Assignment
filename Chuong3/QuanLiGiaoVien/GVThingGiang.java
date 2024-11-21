
package Chuong3.QuanLiGiaoVien;

import java.util.Scanner;

public class GVThingGiang extends GiangVien {
     protected int soTietDay;
    protected double donGia;
    protected double thuNhap;

    public GVThingGiang() {
    }
    public GVThingGiang(String hoTen, String diaChi, String loaiGiangVien,int soTietDay, double donGia) {
        super(hoTen, diaChi, loaiGiangVien);
        this.soTietDay = soTietDay;
        this.donGia = donGia;
        this.thuNhap=(15*(this.soTietDay*this.donGia))/100;
    }

    public String getHoTen() {
        return hoTen;
    }
    
     @Override

     public void nhapThongTin(){
        Scanner sc=new Scanner(System.in);
       super.nhapThongTin();
        System.out.println("Nhap so tiet day: ");
        this.soTietDay=sc.nextInt();
        
        System.out.println("Nhap don gia: ");
        this.donGia=sc.nextDouble();
        
        this.thuNhap=(15*(this.soTietDay*this.donGia))/100;
        
        sc.nextLine();
    }
    @Override
    public double tinhLuong(){
        double luong=this.soTietDay*this.donGia-this.thuNhap;
        return luong;
    }
}

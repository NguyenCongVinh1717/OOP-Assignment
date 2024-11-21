
package Chuong3.QuanLiHocVien;

import java.util.Scanner;

public abstract class HocVien {
    protected String hoTen;
    protected String diaChi;
    protected String loaiChuongTrinh;

    public HocVien() {
    }

    public HocVien(String hoTen, String diaChi, String loaiChuongTrinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiChuongTrinh = loaiChuongTrinh;
    }
    public void nhapThongTin(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ho ten:");
        this.hoTen=sc.nextLine();
        
        System.out.print("Nhap dia chi:");
        this.diaChi=sc.nextLine();
        
        System.out.print("Nhap loai chuong trinh: ");
        this.loaiChuongTrinh=sc.nextLine();
    }
    public abstract double hocPhi();
    public void inThongTin(){
        System.out.println("Ho ten: "+this.hoTen+"\t"+"Dia chi: "+this.diaChi+"\t"+"Loai chuong trinh: "+this.loaiChuongTrinh+"\t"+"Hoc phi: "+this.hocPhi()+"\t");
    }
        
    
    
}


package Chuong3.QuanLiHocVien;

import java.util.Scanner;

public class HocVienLT extends HocVien {
    private int soBuoi;
    private double donGia;
    private int loai;

    public HocVienLT() {
    }

    public HocVienLT( String hoTen, String diaChi, String loaiChuongTrinh, int soBuoi, double donGia, int loai) {
        super(hoTen, diaChi, loaiChuongTrinh);
        this.soBuoi = soBuoi;
        this.donGia = donGia;
        this.loai = loai;
    }
    @Override
    public void nhapThongTin(){
        Scanner sc=new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhap so buoi: ");
        this.soBuoi=sc.nextInt();
        
        System.out.print("Nhap don gia: ");
        this.donGia=sc.nextDouble();
        
        System.out.print("Nhap loai: ");
        this.loai=sc.nextInt();
    }
    @Override
    public double hocPhi(){
        double hocPhi;
        double uuTien=0;
        if(loai==1)
            uuTien=1000000;
        else if(loai==2)
            uuTien=800000;
       hocPhi=this.soBuoi*this.donGia-uuTien;
       return hocPhi;
    }
}

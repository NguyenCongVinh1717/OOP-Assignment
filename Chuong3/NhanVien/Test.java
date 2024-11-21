
package Chuong3.NhanVien;

import Chuong3.DiaChi.DiaChi;

public class Test {
    public static void main(String[] args) {
        DiaChi d1=new DiaChi("Chu Quyen","Chu Minh","Ba Vi","Ha Noi");
        NhanVien n1=new NhanVien("Vinh",d1,"26/2/2005",'M');
        System.out.println("Thong tin dia chi nhan vien: "+n1.getAddress());
        System.out.println("Thong tin nhan vien: "+n1.toString());
        
       
    }
}

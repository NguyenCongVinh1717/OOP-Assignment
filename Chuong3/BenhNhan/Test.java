
package Chuong3.BenhNhan;
public class Test {
    public static void main(String[] args) {
        BenhVien bv1=new BenhVien("Bach Mai","Ha Noi","John");
        BenhNhan b1=new BenhNhan("Vinh",19,'M',"Dau da day","Viem gan",bv1);
        System.out.println("Thong tin benh cua benh nhan 1: "+b1.getChuanDoan());
        System.out.println("Thong tin benh nhan 1: "+b1.toString());
    }
}

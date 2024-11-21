
package Chuong3.DiaChi;


public class Test {
    public static void main(String[] args) {
        DiaChi d1=new DiaChi("Chu Quyen","Chu Minh","Ba vi","Ha Noi");
        DiaChi d2= new DiaChi();
        d2.setXa("Tien Phong");
        System.out.println("Thong tin dia chi 1: "+ d1.toString());
        System.out.println("Ten xa 2: "+d2.getXa());
    }
}

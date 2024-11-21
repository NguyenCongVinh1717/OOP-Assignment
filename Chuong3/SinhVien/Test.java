
package Chuong3.SinhVien;
public class Test {
    public static void main(String[] args) {
        Truong t1=new Truong("HaUI","Ha Noi","Kieu Xuan Thuc");
        SinhVien sv1=new SinhVien("Vinh",19,'M',"CNTT02","CNTT",t1);
        System.out.println("Thong tin ten sinh vien: "+sv1.getTen());
        System.out.println("Thong tin day du cua sv: "+sv1.toString());
    }
}

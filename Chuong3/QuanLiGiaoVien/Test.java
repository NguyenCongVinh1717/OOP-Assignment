
package Chuong3.QuanLiGiaoVien;

import java.util.Scanner;

public class Test {
    public void nhapMang(GVCoHuu a[]) {
        for (int i = 0; i < a.length; i++) {
            a[i] = new GVCoHuu();
            a[i].nhapThongTin();
        }
    }

    public void inMang(GVCoHuu a[]) {
        for (int i = 0; i < a.length; i++) {
            a[i].inThongTin();
        }
    }
    public void sapXepMang(GVCoHuu a[]) {
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].tinhLuong() > a[j].tinhLuong()) {                  
                    GVCoHuu tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }

        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap (2<=n<=5) n=");
            n = sc.nextInt();
            if (n < 2 || n > 5) {
                System.out.println("Nhap lai!");
            }
        } while (n < 2 || n > 5);
        GVCoHuu a[] = new GVCoHuu[n];
        Test test = new Test();
        test.nhapMang(a);
        test.sapXepMang(a);
        test.inMang(a);
        

    }
}

package Chuong4.checkzero;


import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;

        System.out.println("Nhap n=");
        n = sc.nextInt();

        System.out.println("Nhap m=");
        m = sc.nextInt();

        try {
            System.out.println("n/m=" + n / m);
        } catch (ArithmeticException e) {
            System.out.println("K the chia cho 0");
        }

    }
}

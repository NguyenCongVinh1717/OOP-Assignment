package Chuong4.StringTooLongException;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws StringTooLongException {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        do {
            System.out.print("Nhap chuoi: ");
            s = sc.nextLine();
            if (s.length() > 30) {
                throw new StringTooLongException("String is not too long");
            }

        } while ((s.equals("DONE")) == false);
    }

}

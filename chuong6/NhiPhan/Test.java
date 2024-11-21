
package chuong6.NhiPhan;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String s;
        int n;
        double d;
        Scanner sc=new Scanner(System.in);
//            System.out.print("Nhap chuoi: ");
//            s=sc.nextLine();
//            
//            System.out.print("Nhap so nguyen: ");
//            n=sc.nextInt();
//            
//            System.out.print("Nhap so thuc: ");
//            d=sc.nextDouble();
                      
        FileOutputStream out=new FileOutputStream("exp.dat");
        DataOutputStream da=new DataOutputStream(out);
        da.writeChars("vvvv");
        da.writeInt(5);
//        da.writeDouble(d);
        da.close();
        
        try (BufferedReader br = new BufferedReader(new FileReader("exp.dat"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Read line: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
       }
}

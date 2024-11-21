
package chuong6.kitu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s=sc.nextLine();
        
        System.out.print("Nhap so nguyen: ");
        int sn=sc.nextInt();
        
        System.out.println("Nhap so thuc: ");
        double st=sc.nextDouble();
       try{
        FileWriter fw=new FileWriter("exp.txt");
        PrintWriter pr=new PrintWriter(fw);
        pr.print(s+"\n");
        pr.print(sn+"\n");
        pr.print(st+"\n");
        System.out.println("Write file successfully");
        pr.close();
       }
       catch(IOException ex){
           System.out.println("File existed");
           ex.getStackTrace();
       }
       try{
       FileReader fr=new FileReader("exp.txt");
       BufferedReader br=new BufferedReader(fr);
       String line;
       while((line=br.readLine())!=null){
        System.out.println(line);
       }
        
       br.close();
       }
       catch(IOException ex){
           System.out.println("File does not exist");
           ex.getStackTrace();
    }
    }
}


package Chuong4.StringTooLongException2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws StringTooLongException{
        String s;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Nhap chuoi: ");
            s=sc.nextLine();
            try{
            if(s.length()>20)
                throw new StringTooLongException("Error too long");
            }
            catch(Exception e){
                System.out.println("Errow but still continue");
            }
            
        }
        while(true);
    }
}

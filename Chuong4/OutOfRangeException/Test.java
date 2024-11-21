
package Chuong4.OutOfRangeException;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws OutOfRangeException {
        Scanner sc=new Scanner(System.in);
        double salary;
        System.out.print("Input salary: ");
        salary=sc.nextDouble();
        if(salary<5000000||salary>20000000)
            throw new OutOfRangeException("Error about salary");
    }
}

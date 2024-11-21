package chuong6.Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable{
    private String maSV;
    private String name;
    private String dob;
    private char gender;

    public Student() {
    }

    public Student(String maSV, String name, String dob, char gender) {
        this.maSV = maSV;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" + "maSV=" + maSV + ", name=" + name + ", dob=" + dob + ", gender=" + gender + '}';
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Student s1=new Student("123","Vinh","1/1/1",'M');
        Student s2=new Student("234","CV","2/2/2",'M');
        FileOutputStream fout=new FileOutputStream("student.dat");
        ObjectOutputStream ob=new ObjectOutputStream(fout);
        ob.writeObject(s1);
        ob.writeObject(s2);
        ob.close();
        FileInputStream fin=new FileInputStream("student.dat");
        ObjectInputStream oin=new ObjectInputStream(fin);
        System.out.println((Student)oin.readObject());   
        System.out.println((Student)oin.readObject());
        oin.close();
       
        
       // File
        
        
        
    }
}


package Chuong3.Employee;
public class Test {
    public static void main(String[] args) {
        PartTimeEmployee e1=new PartTimeEmployee();
        e1.setName("Vinh");
        e1.setAge(19);
        PartTimeEmployee e2=new PartTimeEmployee("CV",20,'M',"Cong Vinh","20/10/2020",50000);
        System.out.println("Thong tin ve ten va tuoi nhan vien 1: "+e1.getName()+" "+e1.getAge());
        System.out.println("Thong tin day du cua nhan vien 2: "+e2.toString());
    }
            
}

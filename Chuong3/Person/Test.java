
package Chuong3.Person;
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Vinh");
        p1.setDob("26/2/2005");
        p1.setPob("Ba Vi- Ha Noi");
        p1.setGender('M');
        p1.setEmail("vinh@gmail.com");
        p1.setPhone("0963785195");
        System.out.println("Ten: " + p1.getName());
        System.out.println("Thong tin nguoi: "+ p1.toString());
        
    }
}

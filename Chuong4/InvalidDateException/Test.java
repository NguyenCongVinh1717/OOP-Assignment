package Chuong4.InvalidDateException;

public class Test {
    public static void main(String[] args) throws InvalidDateException {
        ThoiGian tg=new ThoiGian(1,13,2001);
        System.out.println(tg.toString());
    }
}


package Chuong4.InvalidDateException;

public class ThoiGian {
    private int ngay;
    private int thang;
    private int nam;

    public ThoiGian() {
    }

    public ThoiGian(int ngay, int thang, int nam) throws InvalidDateException{
        if(ngay<0||thang<0||nam<0||thang>12||ngay>31){
            throw new InvalidDateException("Date is not excepted");
        }
        else{
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        }
    }

    @Override
    public String toString() {
        return "ThoiGian{" + "ngay=" + ngay + ", thang=" + thang + ", nam=" + nam + '}';
    }
    
}

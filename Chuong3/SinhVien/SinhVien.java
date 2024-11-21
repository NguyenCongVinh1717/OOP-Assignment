
package Chuong3.SinhVien;
public class SinhVien extends Nguoi {
    private String lop;
    private String nganh;
    private Truong truong;

    public SinhVien() {
    }

    public SinhVien( String ten, int tuoi, char gioiTinh, String lop, String nganh, Truong truong) {
        super(ten, tuoi, gioiTinh);
        this.lop = lop;
        this.nganh = nganh;
        this.truong = truong;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public void setTruong(Truong truong) {
        this.truong = truong;
    }

    public String getLop() {
        return lop;
    }

    public String getNganh() {
        return nganh;
    }

    public Truong getTruong() {
        return truong;
    }

    @Override
    public String toString() {
        return super.toString()+" SinhVien{" + "lop=" + lop + ", nganh=" + nganh + ", truong=" + truong + '}';
    }
    
}

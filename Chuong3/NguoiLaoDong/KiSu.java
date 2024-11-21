
package NguoiLaoDong;

public class KiSu extends NguoiLaoDong {
     private double luongCoBan;
    private double heSoLuong;
    private int soNgayCong;
    private double thuong;

    public KiSu() {
    }

    public KiSu(String hoTen, String diaChi, double luongCoBan, double heSoLuong, int soNgayCong, double thuong) {
        super(hoTen, diaChi);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.soNgayCong = soNgayCong;
        if (this.soNgayCong >= 25) {
            this.thuong = 2000000;
        } else if (this.soNgayCong > 15 && this.soNgayCong < 25) {
            this.thuong = 1000000;
        } else if (this.soNgayCong <= 15) {
            this.thuong = 500000;
        }
    }

    @Override
    public double tinhLuong() {
        double luongThang = this.luongCoBan * this.heSoLuong + this.thuong;
        return luongThang;
    }

}

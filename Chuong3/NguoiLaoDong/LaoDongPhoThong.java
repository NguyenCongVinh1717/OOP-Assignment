
package NguoiLaoDong;

public class LaoDongPhoThong extends NguoiLaoDong {
    private int soNgayCong;
    private double donGiaCong;
    private double thuong;

    public LaoDongPhoThong() {
    }

    public LaoDongPhoThong(String hoTen, String diaChi, int soNgayCong, double donGiaCong, double thuong) {
        super(hoTen, diaChi);
        this.soNgayCong = soNgayCong;
        this.donGiaCong = donGiaCong;
        if (this.soNgayCong >= 25) {
            this.thuong = 1000000;
        } else if (this.soNgayCong > 15 && this.soNgayCong < 25) {
            this.thuong = 700000;
        } else if (this.soNgayCong <= 15) {
            this.thuong = 0;
        }
    }

    @Override
    public double tinhLuong() {
        double luongThang = this.soNgayCong * this.donGiaCong + this.thuong;
        return luongThang;
    }

}

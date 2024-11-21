
package Chuong3.BenhNhan;

import java.util.logging.Logger;

public class BenhNhan extends Nguoi {
    private String tieuSu;
    private String chuanDoan;
    private BenhVien benhVien;

    public BenhNhan() {
    }

    public BenhNhan( String ten, int tuoi, char gioiTinh, String tieuSu, String chuanDoan, BenhVien benhVien) {
        super(ten, tuoi, gioiTinh);
        this.tieuSu = tieuSu;
        this.chuanDoan = chuanDoan;
        this.benhVien = benhVien;
    }

    public void setTieuSu(String tieuSu) {
        this.tieuSu = tieuSu;
    }

    public void setChuanDoan(String chuanDoan) {
        this.chuanDoan = chuanDoan;
    }

    public void setBenhVien(BenhVien benhVien) {
        this.benhVien = benhVien;
    }

    public String getTieuSu() {
        return tieuSu;
    }

    public String getChuanDoan() {
        return chuanDoan;
    }

    public BenhVien getBenhVien() {
        return benhVien;
    }

    @Override
    public String toString() {
        return super.toString()+" BenhNhan{" + "tieuSu=" + tieuSu + ", chuanDoan=" + chuanDoan + ", benhVien=" + benhVien + '}';
    }
    
    
}

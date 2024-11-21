
package Chuong3.NhanVien;

import Chuong3.DiaChi.DiaChi;

public class NhanVien {
    private String name;
    private DiaChi address;
    private String dob;
    private char gender;

    public NhanVien() {
    }

    public NhanVien(String name, DiaChi address, String dob, char gender) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(DiaChi address) {
        this.address = address;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public DiaChi getAddress() {
        return address;
    }

    public String getDob() {
        return dob;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "name=" + name + ", address=" + address + ", dob=" + dob + ", gender=" + gender + '}';
    }
    
}

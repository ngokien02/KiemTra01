/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KiemTra01;

/**
 *
 * @author ADMIN
 */
public class CD {
    private String maSo, tenCD, caSi;
    private double giaBan;
    private int namPhatHanh;

    public CD(String maSo, String tenCD, String caSi, double giaBan, int namPhatHanh) {
        this.maSo = maSo;
        this.tenCD = tenCD;
        this.caSi = caSi;
        this.giaBan = giaBan;
        this.namPhatHanh = namPhatHanh;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getTenCD() {
        return tenCD;
    }

    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }

    public String getCaSi() {
        return caSi;
    }

    public void setCaSi(String caSi) {
        this.caSi = caSi;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getNamPhatHanh() {
        return namPhatHanh;
    }

    public void setNamPhatHanh(int namPhatHanh) {
        this.namPhatHanh = namPhatHanh;
    }

    @Override
    public String toString() {
        return "\nCD{" + "maSo=" + maSo + ", tenCD=" + tenCD + ", caSi=" + caSi 
                + ", giaBan=" + giaBan + ", namPhatHanh=" + namPhatHanh + "}";
    }
    
}

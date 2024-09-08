/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KiemTra01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/**
 *
 * @author ADMIN
 */
public class QuanLyCD {
    private ArrayList<CD> listCD = new ArrayList<>();
    private CD cd = null;
    private Scanner sc = new Scanner(System.in);
    
    public void KhoiTaoDuLieu(){
        listCD.add(new CD("CD01", "Noi buon gac tro", "Quang Linh", 195000, 2018));
        listCD.add(new CD("CD02", "Bai tinh ca dem", "Duc Tuan", 185000, 2021));
        listCD.add(new CD("CD03", "Cau ho chieu que", "Nhieu ca si", 172000, 2022));
        listCD.add(new CD("CD04", "Tinh dau tinh cuoi", "Van Khanh", 139000, 2022));
        listCD.add(new CD("CD05", "Thanh pho mua bay", "Dan Nguyen", 182000, 2019));
    }
    
    public void xuatVaTongCD(){
        double tong = 0;
        for(CD cd : listCD){
            tong += cd.getGiaBan();
            System.out.println(cd);
        }
        tinhTong();
    }
    
    public void CDtruoc2020(){
        System.out.println("\nDanh sach cac CD phat hanh truoc 2020:\n");
        for(CD cd : listCD){
            if(cd.getNamPhatHanh() < 2020){
                System.out.println(cd);
            }
        }
    }
    
    public void CDChuTinh(){
        String tinh = "tinh";
        System.out.println("\nCac CD ten co chua chu \"tinh\"");
        for(CD cd : listCD){
            if(cd.getTenCD().contains(tinh)){
                System.out.println(cd);
            }
        }
    }
    
    public void xuatGiamDan(){
        Collections.sort(listCD, (CD cd2, CD cd1) -> Double.compare(cd1.getGiaBan(), cd2.getGiaBan()));
        for(CD cd : listCD){
            System.out.println(cd);
        }
    }
    
    public void xoaTheoMS(){
        System.out.print("\nNhap ma so CD muon xoa: ");
        String cdXoa = sc.next();
        int thanhCong = 0;
        for(int i = 0; i < listCD.size(); i++){
            if(cdXoa.equalsIgnoreCase(listCD.get(i).getMaSo())){
                listCD.remove(i);
                thanhCong++;
            }
        }
        if(thanhCong != 0){
            System.out.println("Xoa thanh cong!");
        }
        else{
            System.out.println("\nKhong tim thay ma so CD muon xoa!");
        }
    }
    
    public void suaTheoMS(){
        Boolean timThay = false;
        System.out.print("\nNhap ma so cua CD ban muon sua: ");
        String MSSua = sc.next();
        for (CD cd : listCD) {
            if(cd.getMaSo().equalsIgnoreCase(MSSua)){
                System.out.print("\nNhap gia ban muon sua: ");
                double giaSua = sc.nextDouble();
                cd.setGiaBan(giaSua);
                timThay = true;
                break;
            }
        }
        if(!timThay){
            System.out.println("\nKhong tim thay cd can sua!");
        }
        else{
            System.out.println("\nSua thanh cong!");
        }
    }
    
    public void tinhTong(){
        int tong = 0;
        for(CD cd : listCD){
            tong+= cd.getGiaBan();
        }
        System.out.println("\nTong tri gia cac CD: " + tong);
    }
    
}

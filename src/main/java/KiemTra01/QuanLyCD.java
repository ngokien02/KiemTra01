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
    private static ArrayList<CD> listCD = new ArrayList<>();
    private static CD cd = null;
    private static Scanner sc = new Scanner(System.in);
    
    public static void menu(){
        listCD.add(new CD("CD01", "Noi buon gac tro", "Quang Linh", 195000, 2018));
        listCD.add(new CD("CD02", "Bai tinh ca dem", "Duc Tuan", 185000, 2021));
        listCD.add(new CD("CD03", "Cau ho chieu que", "Nhieu ca si", 172000, 2022));
        listCD.add(new CD("CD04", "Tinh dau tinh cuoi", "Van Khanh", 139000, 2022));
        listCD.add(new CD("CD05", "Thanh pho mua bay", "Dan Nguyen", 182000, 2019));
        
        int chon = 0;
        while(chon != 8){
            System.out.println("\n=====QUAN LY BANG DIA=====");
            System.out.print("\n1. Xuat thong tin va tong tri gia toan bo CD"
                    + "\n2. Xuat cac CD phat hanh truoc nam 2020"
                    + "\n3. Cac CD ten co chu \"tinh\""
                    + "\n4. Xuat CD theo gia giam dan"
                    + "\n5. Xoa CD theo ma so"
                    + "\n6. Sua gia ban CD theo ma so"
                    + "\n7. Tong tri gia cac CD trong cua hang"
                    + "\n8. Ket thuc"
                    + "\nChon hanh dong ban muon thuc hien: ");
            chon = sc.nextInt();
            switch(chon){
                case 1:
                    xuatVaTongCD();
                    break;
                case 2:
                    CDtruoc2020();
                    break;
                case 3:
                    CDChuTinh();
                    break;
                case 4:
                    xuatGiamDan();
                    break;
                case 5:
                    xoaTheoMS();
                    break;
                case 6:
                    suaTheoMS();
                    break;
                case 7:
                    tinhTong();
                    break;
                case 8:
                    System.out.println("\nGood bye. Thanks for using our program!");
                    break;
            }
        }
    }
    
    public static void xuatVaTongCD(){
        double tong = 0;
        for(CD cd : listCD){
            tong += cd.getGiaBan();
            System.out.println(cd);
        }
        System.out.println("\nTong tri gia CD trong cua hang: " + tong);
    }
    
    public static void CDtruoc2020(){
        System.out.println("\nDanh sach cac CD phat hanh truoc 2020:\n");
        for(CD cd : listCD){
            if(cd.getNamPhatHanh() < 2020){
                System.out.println(cd);
            }
        }
    }
    
    public static void CDChuTinh(){
        String tinh = "tinh";
        System.out.println("\nCac CD ten co chua chu \"tinh\"");
        for(CD cd : listCD){
            if(cd.getTenCD().contains(tinh)){
                System.out.println(cd);
            }
        }
    }
    
    public static void xuatGiamDan(){
        Collections.sort(listCD, (CD cd2, CD cd1) -> Double.compare(cd1.getGiaBan(), cd2.getGiaBan()));
        for(CD cd : listCD){
            System.out.println(cd);
        }
    }
    
    public static void xoaTheoMS(){
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
    
    public static void suaTheoMS(){
        int dem = 0;
        System.out.print("\nNhap ma so cua CD ban muon sua: ");
        String MSSua = sc.next();
        for (int i = 0; i < listCD.size(); i++) {
            if(MSSua.equalsIgnoreCase(listCD.get(i).getMaSo())){
                System.out.print("\nNhap gia ban muon sua: ");
                double giaSua = sc.nextDouble();
                listCD.get(i).setGiaBan(giaSua);
                dem++;
            }
            else{
                break;
            }
        }
        if(dem != 0){
            System.out.println("\nSua thanh cong!");
        }
        else{
            System.out.println("\nKhong tim thay cd muon sua!");
        }
    }
    
    public static void tinhTong(){
        int tong = 0;
        for(CD cd : listCD){
            tong+= cd.getGiaBan();
        }
        System.out.println("\nTong tri gia cac CD: " + tong);
    }
    
}

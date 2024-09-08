/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KiemTra01;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class MainCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuanLyCD qlcd = new QuanLyCD();
        Scanner sc = new Scanner(System.in);
        qlcd.KhoiTaoDuLieu();
        
        int chon = 0;
        while (chon != 8) {
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
            switch (chon) {
                case 1:
                    qlcd.xuatVaTongCD();
                    break;
                case 2:
                    qlcd.CDtruoc2020();
                    break;
                case 3:
                    qlcd.CDChuTinh();
                    break;
                case 4:
                    qlcd.xuatGiamDan();
                    break;
                case 5:
                    qlcd.xoaTheoMS();
                    break;
                case 6: 
                    qlcd.suaTheoMS();
                    break;
                case 7:
                    qlcd.tinhTong();
                    break;
                case 8:
                    System.out.println("\nGood bye. Thanks for using our program!");
                    break;
            }
        }
    }
}

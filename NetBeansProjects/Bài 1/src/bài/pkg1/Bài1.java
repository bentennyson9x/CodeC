/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài.pkg1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bài1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        final int thueBaoDienKe = 1000;
        int chiSoCu, chiSoMoi, chiSo, soTienPhaiTra = 0, phanVuotDinhMuc, tienTraDinhMuc, tienTraVuotDinhMuc = 0;
        
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Please Enter Old Value: ");
            chiSoCu = Integer.parseInt(sc.nextLine());
            System.out.println("Please Enter New Value: ");
            chiSoMoi = Integer.parseInt(sc.nextLine());    
            if (chiSoMoi < chiSoCu) System.out.println("Try Again!");
            else break;
        }               
        chiSo = chiSoMoi - chiSoCu;
        
        if (chiSo <= 50) {
            tienTraDinhMuc = chiSo * 230;
            tienTraVuotDinhMuc = 0;
            soTienPhaiTra = chiSo * 230 + thueBaoDienKe;
        }
        else {
            phanVuotDinhMuc = chiSo - 50;
            tienTraDinhMuc = 50 * 230;
            if (phanVuotDinhMuc <= 50){
                tienTraVuotDinhMuc = phanVuotDinhMuc * 480;
                soTienPhaiTra = tienTraDinhMuc + phanVuotDinhMuc * 480 + thueBaoDienKe;
            }
            else if (phanVuotDinhMuc > 50 && phanVuotDinhMuc < 100){
                tienTraVuotDinhMuc = phanVuotDinhMuc * 700;
                soTienPhaiTra = tienTraDinhMuc + phanVuotDinhMuc * 700 + thueBaoDienKe;
            }
            else if (phanVuotDinhMuc > 100){
                tienTraVuotDinhMuc = phanVuotDinhMuc * 900;
                soTienPhaiTra = tienTraDinhMuc + phanVuotDinhMuc * 900 + thueBaoDienKe;
            }
        }
        
        System.out.println("******Bill*******");
        System.out.printf("Old Value: %d\n", chiSoCu);
        System.out.printf("New Value: %d\n", chiSoMoi);
        System.out.printf("Standard Payment : %d\n", tienTraDinhMuc);
        System.out.printf("Over Payment: %d\n", tienTraVuotDinhMuc);
        System.out.printf("All Price You Must Return: %d\n", soTienPhaiTra);
        }
    
    }
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.pkg6;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Bai6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float chiSoCu,chiSoMoi, tienTraDinhMuc = 0,tienTraVuotDinhMuc = 0,tongTien, mucSuDungDien;
        Scanner s= new Scanner(System.in);
        do{
            System.out.println("Nhập giá trị của chỉ số cũ: ");
        chiSoCu= Float.parseFloat(s.nextLine());
            System.out.println("Nhập giá trị của chỉ số mới: ");
        chiSoMoi=Float.parseFloat(s.nextLine());
           if (chiSoCu>chiSoMoi) System.out.println("Ban vui lòng nhập lại giá trị. Chỉ số cũ lúc nào cũng nhỏ hơn chỉ số mới");
        }while (chiSoCu>chiSoMoi);
            mucSuDungDien=chiSoMoi-chiSoCu;
            if (mucSuDungDien<=50){
                tienTraDinhMuc=mucSuDungDien*230;
                tienTraVuotDinhMuc=0;
            }
            else{
                  if(mucSuDungDien-50<=50){
                       tienTraDinhMuc=50*230;
            tienTraVuotDinhMuc = 480*(mucSuDungDien);
        }
        else if (mucSuDungDien-50>50&&mucSuDungDien-50<100){
            tienTraDinhMuc=50*230;
            tienTraVuotDinhMuc=700*(mucSuDungDien);
        }
        else if (mucSuDungDien-50>=100){
            tienTraDinhMuc=50*230;
            tienTraVuotDinhMuc=900*(mucSuDungDien);
        }
            }
            tongTien=tienTraDinhMuc+tienTraVuotDinhMuc+1000;
           System.out.printf("Số tiền bạn phải trả là : %f\n",tongTien);
            
            
     
        
}

}
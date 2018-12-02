/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài3;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class java {
    public static void main(String[] args) {
        float Toan, Ly, Hoa, average;
              String choice;
         Scanner s = new Scanner (System.in);
            do{   
         System.out.println("Please Enter Math Point: ");
         Toan=Float.parseFloat(s.nextLine());
         System.out.println("Please Enter Physical Point: ");
         Ly=Float.parseFloat(s.nextLine());
         System.out.println("Please Enter Chemistry Point: ");
         Hoa=Float.parseFloat(s.nextLine());
         average=(Toan+Ly+Hoa)/3;
         if(average<5) System.out.println("Weak!!");
         else if(average>=5&&average<8){
             System.out.println("Good!!");
         }else {
             System.out.println("Excellent!!");
         } 
                System.out.println("Do you want continue? OK or NO :");
                choice=s.nextLine();
         }
            while(choice.equals("OK"));
              
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class java {
    public static void main(String[] args) {
        int hour;
        int luong;
        float money;
        Scanner s = new Scanner (System.in);
        System.out.println("Please Enter Number of Hour : ");
        hour= Integer.parseInt(s.nextLine());
        System.out.println("Please Enter Number of Salary ( Salary/ Hour ) : ");
        luong=Integer.parseInt(s.nextLine());
        money= hour*luong;
        if (hour>40){
            money= (float) ( 40*luong + (hour - 40)*luong*1.5 );
        }
        System.out.printf("Your Money is : %f", money);
        
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài.pkg5;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Bài5 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        // TODO code application logic here
        int month,year;
        Scanner s= new Scanner(System.in);
        System.out.println("Please enter year: ");
        year=Integer.parseInt(s.nextLine());
        if (year%4==0){
        System.out.println("Please enter month: ");
          month=Integer.parseInt(s.nextLine());
         if (month==1||month==3||month==5||month==7||month==8||month==10||month==12){
                                                                  System.out.println("This month has 30 days ");
                                                                   }
                                                              else if (month==2){
                                                                  System.out.println("This month has 29 days");
                                                                    }
                                 }
            else{
                        System.out.println("Please enter month: ");
         month=Integer.parseInt(s.nextLine());
         if (month==1||month==3||month==5||month==7||month==8||month==10||month==12){
             System.out.println("This month has 30 days ");
         }
         else if (month==2){
             System.out.println("This month has 28 days");
         }
        }   
    }
}


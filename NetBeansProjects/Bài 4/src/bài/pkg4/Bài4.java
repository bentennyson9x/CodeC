/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài.pkg4;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Bài4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []a=new int[5];
        Scanner s= new Scanner(System.in);
        for (int i=0;i<4 ;i++){
            System.out.printf("Nhap so thu %d :",i+1);
            a[i+1]=Integer.parseInt(s.nextLine());
        }
        int mark = a[1];
        if (mark<a[2]) mark = a[1];
        if (mark<a[3]) mark =a[3];
        if (mark<a[4]) mark= a[4];
        System.out.printf("So lon nhat trong 4 so vua nhap vao la : %d\n", mark);
    }
    
}

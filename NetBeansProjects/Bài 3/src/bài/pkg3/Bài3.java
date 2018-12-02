/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài.pkg3;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Bài3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter value of n: ");
        n=Integer.parseInt(s.nextLine());
        for (int i=0;i<n;i++){
            for (int j=0;j<i+1;j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
    
}

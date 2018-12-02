/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaApplication1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class pratice2 {

    public static void main(String[] args) {
        String name, addr;
        int age;
        float score1, score2, score3;
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter Name: ");
        name = s.nextLine();
        System.out.println("Please Enter Address: ");
        addr = s.nextLine();
       System.out.println("Please Enter Age: ");
        age = Integer.parseInt(s.nextLine());
        System.out.println("Please Enter Score 1 : ");
        score1 = Float.parseFloat(s.nextLine());
        System.out.println("Please Enter Score 2 : ");
        score2 = Float.parseFloat(s.nextLine());
        System.out.println("Please Enter Score 3 : ");
        score3 = Float.parseFloat(s.nextLine());
        float bonus = (float) 1.5;
        float average;
        average = (float) (1.5+(score1 + score2 + score3) /3);
        System.out.printf("Name : %s \nAdress: %s\nAge: %d\nScore 1 : %f,     Score 2 : %f,     Score 3 : %f,     Bonus : %f,     Avarage: %f", name, addr,age, score1, score2, score3, bonus, average);
//System.out.printf("Name : %s \nAdress: %s\nAge: %d\nScore 1 : %f,     Score 2 : %f,     Score 3 : %f     Bonus : %f,     Avarage: %f", name, addr,age,score1,score2,score3,bonus,average);
    }

}

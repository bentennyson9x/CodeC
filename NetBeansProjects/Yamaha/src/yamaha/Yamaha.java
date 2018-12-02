/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yamaha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author hp
 */
public class Yamaha {

    static Scanner s = new Scanner(System.in);
    static List<Jupiter> a = new ArrayList<>();
    static List<Serius> b = new ArrayList<>();

    public static void Input() {
        do {
            Jupiter temp = new Jupiter(2, "B12", "AXT", 1.9, 20);
            System.out.println("Please Input Information for Jupiter: ");
            temp.InputInfor();
            a.add(temp);
        } while (a.size() < 3);
        do {
            Serius temp1 = new Serius(2, "B12", "AXT", 1.9, 20);
            System.out.println("Please Input Information for Serius: ");
            temp1.InputInfor();
            b.add(temp1);
        } while (b.size()<3);
        String choice;
        do {
            System.out.println("Do you want to add more ? ");
            choice = s.nextLine();
            if (choice.equalsIgnoreCase("Yes")) {
                System.out.println("What Motor do you want to add more ( Jupiter or Serius ) ?");
                String choice1 = s.nextLine();
                do {
                    if (choice1.equalsIgnoreCase("Jupiter")) {
                        Jupiter temp = new Jupiter(2, "B12", "AXT", 1.9, 20);
                        System.out.println("Please Input Information for Jupiter: ");
                        temp.InputInfor();
                        a.add(temp);
                    } else if (choice1.equalsIgnoreCase("Serius")) {
                        Serius temp = new Serius(2, "B12", "AXT", 1.9, 20);
                        System.out.println("Please Input Information for Serius: ");
                        temp.InputInfor();
                        b.add(temp);
                    } else {
                        System.out.println("You must choose Jupiter or Serius. Please Try Again :");
                    }
                } while (choice1.equalsIgnoreCase("Jupiter") == false || choice1.equalsIgnoreCase("Serius") == false);

            } else if (choice.equalsIgnoreCase("No")) {
                System.out.println("Done! ");
            } else {
                System.out.println("You must choose Yes or No. Please Try Again : ");
            }
        } while (choice.equalsIgnoreCase("Yes") == true);

    }

    public static void Display() {
        if (a.size()==0){
            System.out.println("Here is no information of list Jupiter. Please make input for it !! ");
        }
        else {
             System.out.println("Here is information of all Jupiter in list : ");
        for (Jupiter i : a) {
            i.DisplayInfor();
        }
        }
        if (b.size()==0){
            System.out.println("Here is no information of list Serius. Please make input for it.!!");
        }
        else {
            System.out.println("Here is information of all Serius in list : ");
        for (Serius i : b) {
            i.DisplayInfor();
        }
        }
    }

    public static void main(String[] args) {
        AtomicInteger n = new AtomicInteger();
        do {
            System.out.println("********* Menu **********");
            System.out.println(" 1- Input ");
            System.out.println(" 2- Display ");
            System.out.println(" 3- Sort ");
            System.out.println(" 4- Search ");
            System.out.println(" 5- Thoat ");
            System.out.println(" Your choice is : ");
            n.set(Integer.parseInt(s.nextLine()));
            switch (n.get()) {
                case 1:
                    Input();
                    break;
                case 2:
                    Display();
                    break;
                case 3:
                    Collections.sort(a);
                    Collections.sort(b);
            }
        } while (n.get() !=5);
    }

}

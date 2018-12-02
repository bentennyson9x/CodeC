
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class bai5 {
  static int choice = 0, n = 0;
   static int []a= new int[40];
   static String s1="0123456789ABCDEF";
   static char[] b=s1.toCharArray();
   static int dem;
   public static void Xuat(int[] a , int dem){
       for (int i=dem-1;i>=0;i--){
           System.out.print(""+b[a[i]]+" ");
       }
   }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("**********- Welcome to My Program  -**************");
        do {            
                    System.out.printf("1.Enter one Integer\n2.Convert to Binary\n3.Convert to Octal\n4.Convert to Heximal\n5.Exit Please enter your choice : ");
        choice=Integer.parseInt(s.nextLine());
        switch(choice){
            case 1 :
            {
                System.out.println("Please enter one Interger to convert: ");
                n = Integer.parseInt(s.nextLine()); 
                 break;
            }
           case 2:
           {
             while (n>0){
                 a[dem]=n%2;
                 n/=2;
                 dem++;
             }
             Xuat(a, dem);
             dem=0;
             break;
           }
           case 3: 
           {
               while (n>0){
                 a[dem]=n%8;
                 n/=8;
                 dem++;
             }
             Xuat(a, dem);
             dem=0;
             break;
           }
                case 4 :
        {
            while (n>0){
                 a[dem]=n%16;
                 n/=16;
                 dem++;
             }
             Xuat(a, dem);
             dem=0;
             break;
        }
                case 5:
                    System.out.println("Good Bye!!");
                
        }
        if (choice==5){
            break;
        }
        if (choice==1){
            System.out.println("Please reselect. Your choice is: ");
        }
        } while (choice==1);
    }
}

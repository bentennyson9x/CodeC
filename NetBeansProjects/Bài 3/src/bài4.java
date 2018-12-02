
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
public class bài4 {
    public static void main(String[] args) {
         int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter value of n: ");
        n=Integer.parseInt(s.nextLine());
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n*2;j++){
                if (j>=n-i+1&&j<=n+i-1){
                    System.out.print(" * ");
                }
                else System.out.print("   "); 
            }
            System.out.println("");
        }
    }
    
}

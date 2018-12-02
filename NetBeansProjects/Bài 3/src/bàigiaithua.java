
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
public class bàigiaithua {
    static int n;
    public static int DQGT (int n){
      if(n<=1) return 1;
        return n*DQGT(n-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter value of n: ");
        n=Integer.parseInt(s.nextLine());
        n=DQGT(n);
        System.out.println("Value factorial of n is : "+n);
    }
}
        
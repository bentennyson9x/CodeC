
import com.sun.corba.se.impl.encoding.CDRInputStream_1_0;
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
public class bài5 {
    public static void main(String[] args) {
         int n, dem=1;
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter value of n: ");
        n=Integer.parseInt(s.nextLine());
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n*2;j++){
                if (j>=n-i+1&&j<=n+i-1){
                    if (j>=n){
                        if (dem>=10) System.out.printf(" %d ",dem%10);
                     else System.out.printf(" %d ",dem );
                      
                    dem--;
                    }
                    else {
                          if (dem>=10)System.out.printf(" %d ",dem%10);
                       else
                          System.out.printf(" %d ",dem );
                      
                    dem++;
                    }
                }
                else System.out.print("   "); 
            }
            dem=dem+2;
            System.out.println("");
        }
    }
    }

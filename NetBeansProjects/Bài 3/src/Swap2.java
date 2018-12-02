




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Swap2 {
    public static void Swap1 (int []a, int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void main(String[] args) {
        int []a= {
            5,4,3,2,1
        };
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if (a[i]>a[j]) Swap1(a,i, j);
            }
        }
        for (int i=0;i<5;i++){
            System.out.println(""+a[i]+" ");
        }
    }
}

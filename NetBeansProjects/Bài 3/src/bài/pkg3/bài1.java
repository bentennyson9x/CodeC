/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài.pkg3;

/**
 *
 * @author hp
 */
public class bài1 {
    static int i;

    /**
     *
     * @param i
     * @return
     */
    public static int KTT(int i){
        int s = 0;
        while (i!=0){
            s+=i%10;
            i=i/10;
        }
        if (s%2==0){
            return 1;
        }
        else return 0;
    }
    public static void main(String[] args) {
        for (i=100;i<1000;i++){
            if (KTT(i)!=0){
                System.out.print("  "+i);
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CacProblemVaThuatToan2;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author hp
 */
//Tìm giá trị a,b,c,d : 10 + a + b + 3 + c + d = 100, (a,b,c,d) chạy từ 1 => 50.
public class timABCDtrong1Tong {

    static int n = 3; // tư tưởng bài toán chỉ cần tìm abc là ra d sau đó sinh hoán vị
    // cho nên chỉ cần quan tâm thằng a b c và a sẽ là thằng dùng để xét tăng thì d cũng sẽ phải giảm theo a ( a tăng 1 đơn vị thì d giảm 1 đơn vị );
    static int a[] = new int[100];
    static AtomicInteger[] b = new AtomicInteger[100];

    public static void Swap(AtomicInteger a, AtomicInteger b) {

        AtomicInteger temp = new AtomicInteger();
        temp.set(a.get());
        a.set(b.get());
        b.set(temp.get());

    }

    public static void GenerativeH(AtomicInteger[] b) {
        int i = n, k = n + 1;
      //  Dipslay();
        while (i > 0) {
            Dipslay();
            i = n;
            k = n + 1;
            while ((i > 0 && b[i].get() > b[i + 1].get())||(i>0&&b[i].get()==b[i+1].get())) {
                i--;
            }
            while ((i>0&&b[i].get() > b[k].get())||(i>0&&b[i].get()==b[k].get())) {
                k--;
            }
            Swap(b[i], b[k]);
            int s = i + 1, r = n + 1;
            while (s < r) {
                Swap(b[s], b[r]);
                s++;
                r--;
            }  
        }

    }
     public static void Display(int []a){
         for (int i=1;i<=3;i++){
             System.out.print(""+a[i]);
         }
         System.out.println("");
     }
    public static void Dipslay() {
        System.out.println("    a   b   c   d");
        for (int i = 1; i <= 4; i++) {
            System.out.print("    " + b[i].get());
        }
        System.out.println("");
    }

    public static int Try(int i) {
        for (int j = a[i - 1] + 1; j <= 50; j++) {
            a[i] = j;
            if (i == n) {
             //   Display(a);
                for (int k = 1; k <= 3; k++) {
                    b[k].set(a[k]);
                }
                int s = 0, r = 0;
                for (int k = 1; k <= 3; k++) {
                    s += a[k];
                    r = 87 - s;
                }
                if (r <= 50&&r>=1&&r!=a[1]&&r!=a[2]&&r!=a[3]) {
                    b[n + 1].set(r);
                    GenerativeH(b);
                   // System.out.println("Done 1!!");
                }
            } else {
                Try(i + 1);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            b[i] = new AtomicInteger();
        }
        Try(1);

    }
}

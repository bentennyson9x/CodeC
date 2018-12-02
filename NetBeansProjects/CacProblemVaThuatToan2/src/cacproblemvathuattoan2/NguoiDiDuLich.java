/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cacproblemvathuattoan2;

import static cacproblemvathuattoan2.GreedyAlgorithmsActivitySelection.n;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author hp
 */
public class NguoiDiDuLich {
    static int chiPhi = 0;
    static int numberOfCity;
    static int MinChiPhi = 100000000;
    static int X[] = new int[100];
    static boolean Test[] = new boolean[100];
    static int GiaTienTungThanhPho[][] = new int[100][100];

    public static void Result() {
        for (int i = 1; i <= numberOfCity; i++) {
            System.out.print("" + X[i]);
        }
        System.out.println("");
    }

    public static int TinhToan(int k) {
        chiPhi = 0;
        for (int i = 1; i <= k; i++) {
            if (i == numberOfCity) {
                chiPhi += GiaTienTungThanhPho[X[i]][1];
            } else {
                chiPhi += GiaTienTungThanhPho[X[i]][X[i + 1]];
            }
        }

        return chiPhi;
    }

    public static int Try(int i) {
        for (int j = 1; j <= numberOfCity; j++) {
            if (Test[j] == true) {
                X[i] = j;
                if (X[1] == 2) {
                    return 0;
                }
                Test[j] = false;
                if (i==numberOfCity) {
                    if (TinhToan(i)<MinChiPhi)
                        MinChiPhi=TinhToan(i);
                }
                else if (MinChiPhi>TinhToan(i)){
                    Try(i+1);
                }
                Test[j]= true;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Arrays.fill(Test, true);
       // Scanner s = new Scanner(System.in); neu nhap vao tu ban phim
        File file = new File("InputNDDL.txt");
        try (Scanner s = new Scanner(file);) {
            numberOfCity = Integer.parseInt(s.nextLine());
            for (int i = 1; i <= numberOfCity; i++) {
                for (int j = 1; j <= numberOfCity; j++) {
                    GiaTienTungThanhPho[i][j] = s.nextInt();
                }
            }
        } catch (Exception e) {
        }
//        numberOfCity= Integer.parseInt(s.nextLine()); // neu nhap vao tu ban phim
//          for (int i = 1; i <= numberOfCity; i++) {
//                for (int j = 1; j <= numberOfCity; j++) {
//                    GiaTienTungThanhPho[i][j] =s.nextInt();
//                   // s.nextLine();
//                }
//            }
        Try(1);
        System.out.println("" + MinChiPhi);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cacproblemvathuattoan2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author hp
 */
public class GreedyAlgorithmsActivitySelection {
    static int[] Start = new int [100];
    static int [] Finish = new int [100];
    static int [] Result = new int [100];
    static int IndexofResult = 0;
    static AtomicInteger n = new AtomicInteger();
    public static void Input () throws FileNotFoundException, IOException{
        File file = new File("Input.txt");
        try(Scanner s = new Scanner(file);) {
            n.set(s.nextInt());
            for (int i=0;i<n.get();i++){
                s.nextLine();
                Start[i]= s.nextInt();
                Finish[i]=s.nextInt();
            }
        } catch (Exception e) {
        }
    }
    public static void QuickSort(int[] Array, int left, int right) {
        int i = left, j = right;
        int pivot = Array[(left + right) / 2];
        while (i <= j) {
            while (Array[i] < pivot) {
                i++;
            }
            while (Array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = Array[i];
                Array[i] = Array[j];
                Array[j] = temp;
                i++;
                j--;
            }
        }
        if (i < right) {
            QuickSort(Array, i, right);
        }
        if (j > left) {
            QuickSort(Array, left, j);
        }
    }
    public static void Test (){
        int i=0,j=i+1;
        Result[IndexofResult]=i+1;
            IndexofResult++;
        while (j<n.get()-1){
            while(Start[j]<Finish[i]&&j<n.get()) j++;
            i=j;j++;
            Result[IndexofResult]=i+1;
            IndexofResult++;
        }
        if (Start[j]>Finish[i]) {
            i=j;
            Result[IndexofResult]=i+1;
            IndexofResult++;
        }
       
    }
    
    public static void main(String[] args) throws IOException {
      Input();
        QuickSort(Finish,0,n.get()-1);
       Test();
      for (int i=0;i<IndexofResult;i++){
          System.out.println("   "+Result[i]);
      }
    }
}

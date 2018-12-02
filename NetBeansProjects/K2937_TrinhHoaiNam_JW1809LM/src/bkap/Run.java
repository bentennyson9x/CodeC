    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lab06
 */
public class Run {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        List<Product> listSorted = new ArrayList<>();

        while (true) {
            int lc = 0;
            System.out.println("1. Nhap thong tin san pham");
            System.out.println("2. Hien thi thong tin san pham");
            System.out.println("3. Tinh loi nhuan cho cac san pham");
            System.out.println("4. Tim san pham co tax lon nhat va in thong tin ra man hinh");
            System.out.println("5. Sap xep san pham theo profit giam dan");
            System.out.println("6. Tim kiem san pham theo mau sac");
            System.out.println("7. In thong tin san pham co price > 100 ra file co ten Products.txt");
            System.out.println("8. Doc thong tin tu file va hien thi ra man hinh");
            System.out.println("9. Thoat");
            System.out.println("Ban chon: ");
            lc = Integer.parseInt(in.nextLine());
            if (lc == 9) {
                System.exit(0);
            }
            switch (lc) {
                case 1:
                    Product a = new Product();
                    a.inputData();
                    list.add(a);
                    break;
                case 2:
                    for (Product b : list) {
                        b.outputData();
                    }
                    break;
                case 3:
                    for (int i = 0; i < list.size(); i++) {
                        list.get(i).tinhProfit();
                    }
                    break;
                case 4:
                    double max = 0;
                    int chiso = 0;
                    for (int i = 0; i < list.size(); i++) {
                        if (max < list.get(i).getTax()) {
                            max = list.get(i).getTax();
                            chiso = i;
                        }
                    }
                    System.out.println("San pham co tax lon nhat la: " + max);
                    list.get(chiso).outputData();
                    break;
                case 5:
                    for (int i = 0; i < list.size() - 1; i++) {
                        for (int j = i + 1; j < list.size(); j++) {
                            if (list.get(i).getProfit() < list.get(j).getProfit()) {
                                Product tmp = new Product();
                                tmp = list.get(i);
                                list.set(i, list.get(j));
                                list.set(j, tmp);
                            }
                        }
                    }
                    break;
                case 6:
                    String color;
                    System.out.println("Nhap vao mau sac can tim: ");
                    color = in.nextLine();
                    for (Product b : list) {
                        if (b.getColor().equalsIgnoreCase(color)) {
                            b.outputData();
                        }
                    }
                    break;
                case 7:
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getExportPrice() > 100) {
                            listSorted.add(list.get(i));
                        }
                    }
                    try {
                        FileOutputStream fos = new FileOutputStream("Products.txt");
                        ObjectOutputStream objout = new ObjectOutputStream(fos);
                        objout.writeObject(listSorted);
                        objout.flush();
                        fos.close();
                    } catch (Exception e) {
                        e.getMessage();
                    }
                    break;
                case 8:
                    try {

                        FileInputStream fis = new FileInputStream("Products.txt");
                        ObjectInputStream oin = new ObjectInputStream(fis);
                        List<Product> listRead = new ArrayList<>();
                        listRead = (List<Product>) oin.readObject();
                        oin.close();
                        fis.close();
                        for (Product b : listRead) {
                            b.outputData();
                        }

                    } catch (Exception e) {
                        e.getMessage();
                    }
                    break;

            }
        }
    }
}

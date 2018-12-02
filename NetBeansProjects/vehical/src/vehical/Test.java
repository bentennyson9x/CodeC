/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehical;

import Vehicle.Car.Car;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import vehical.Truck.Truck;

/**
 *
 * @author 609
 */
public class Test {

    static Truck[] b = new Truck[3];
    static List<Car> listCar = new ArrayList<Car>();
    static List<Truck> listTruck = new ArrayList<Truck>();
//    private static void swap(Car car, Car car0) {
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        Car temp = new Car(car.getColor(), car.getMaker(), car.getModel(), car.getPrice());
//        System.out.println("temp: ");
//        temp.display();
//        car.setColor(car0.getColor());
//        car.setMaker(car0.getMaker());
//        car.setModel(car0.getModel());
//        car.setPrice(car0.getPrice());
//        System.out.println("car : ");
//        car.display();
//        car0.setColor(temp.getColor());
//        car0.setMaker(temp.getMaker());
//        car0.setModel(temp.getModel());
//        car0.setPrice(temp.getPrice());
//        System.out.println("caro: ");
//        car0.display();
//    }
    //public static int []c =  {5,4,3,2,1};

//public static void setstatic (Car []a){
//    for (int i=0;i<3;i++){
//        static a[i]= new Car();
//    }
//}
    public static <E> void Swap(E[] a) {
        if (a instanceof Car[]) {
            for (int i = 0; i < a.length; i++) {
                for (int j = i; j < a.length; j++) {
                    if (((Car) a[i]).getPrice() > ((Car) a[j]).getPrice()) {
                        E temp;
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
        }
        if (a instanceof Truck[]) {
            for (int i = 0; i < a.length; i++) {
                for (int j = i; j < a.length; j++) {
                    if (((Truck) a[i]).getTruckLoad() > ((Truck) a[j]).getTruckLoad()) {
                        E temp;
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
        }
    }

    public static void Swap(Car a, Car b) {
        Car temp = new Car();
        temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {

     
            
                Car[] a = new Car[3];
                Scanner s = new Scanner(System.in);
                int n;
                a[0] = new Car("Red", "asfasf", "asd1", 5);
                a[1] = new Car("Red1", "asfasf", "asd1", 4);
                a[2] = new Car("Red2", "asfasf", "asd1", 3);
                b[0] = new Truck(20, "asfasdasd", "asdd1", 5);
                b[1] = new Truck(19, "asfasdasd", "asdd1", 5);
                b[2] = new Truck(18, "asfasdasd", "asdd1", 5);
                do {
                    System.out.println("********** Menu ***********");
                    System.out.println("1. Input");
                    System.out.println("2. Display");
                    System.out.println("3. Sort by Price");
                    System.out.println("4. Search by Model");
                    System.out.println("5. Exit");
                    System.out.println(" Your Choise: ");
                    n = Integer.parseInt(s.nextLine());
//            for (int i=0;i<3;i++){
//            a[i] = new Car();
//            b[i] = new Truck();
//        }
                    
                    switch (n) {
                        case 1:
                            for (int i = 0; i < 3; i++) {
                                a[i] = new Car();
                                System.out.println("Nhap Car thu " + (i + 1) + " : ");
                                a[i].input();
                                listCar.add(a[i]);
                            }
                            for (int i = 0; i < 3; i++) {
                                b[i] = new Truck();
                                System.out.println("Nhap Truck thu " + (i + 1) + " : ");
                                b[i].input();
                                listTruck.add(b[i]);
                            }
                            break;
                        case 2:
                            for (Car i : listCar) {
                                System.out.println("Car thu " + (listCar.indexOf(i) + 1) + " : ");
                                i.display();
                            }
                            for (Truck i : listTruck) {
                                System.out.println("Truck thu " + (listTruck.indexOf(i) + 1) + " : ");
                                i.display();
                            }
                            
                            break;
                        case 3:
                            
//                            Collections.sort(listCar,new Comparator<Car>() {
//
//                                @Override
//                                public int compare(Car o1, Car o2) {
//                                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//                                    if(o1.getPrice()<o2.getPrice()) return -1;
//                                    else if (o1.getPrice()>o2.getPrice()) return 1;
//                                    else return 0;
//                                }
//                            });
//                            Collections.sort(listTruck, new Comparator<Truck>() {
//
//                @Override
//                public int compare(Truck o1, Truck o2) {
//                   if(o1.getPrice()<o2.getPrice()) return -1;
//                                    else if (o1.getPrice()>o2.getPrice()) return 1;
//                                    else return 0;
//                }
//            });
//                            
//                      for (Car i : listCar){
//                       System.out.println("Car thu "+(listCar.indexOf(i)+1)+" : ");
//                       i.display();
//                   }
//                   for (Truck i : listTruck){
//                       System.out.println("Truck thu "+(listTruck.indexOf(i)+1)+" : ");
//                       i.display();
//                   }
//                       
//                    break;
                            Swap(a);
//                    Swap(b);
                    for (int i=0;i<3;i++){
                        for (int j=i;j<3;j++){
                            if (a[i].getPrice()>a[j].getPrice()){
                                Swap(a[i], a[j]);
                            }
                        }
                    }
                            for (int i = 0; i < 3; i++) {
                                a[i].display();
                                //b[i].display();
                            }
                            break;
                        case 4:
                            String temp;
                            System.out.println("Nhap Model ban can tim: ");
                            temp = s.nextLine();
                            for (int i = 0; i < 3; i++) {
                                if (temp.equals(a[i].getModel())) {
                                    a[i].display();
                                } else if (temp.equals(b[i].getModel())) {
                                    b[i].display();
                                }
                            }
                            break;
                    }
                    if (n == 5) {
                        System.out.println("Ban da thoat chuong trinh!!");
                    }
                } while (n != 5);

    }
}
    

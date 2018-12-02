/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehical.Truck;

import java.util.Scanner;
import vehical.Vehicle;

/**
 *
 * @author 609
 */
public class Truck extends Vehicle {
    Scanner s = new Scanner (System.in);
    int TruckLoad;

    public Truck() {
    }

    public Truck(int TruckLoad) {
        this.TruckLoad = TruckLoad;
    }

    public Truck(int TruckLoad, String maker, String model, double price) {
        super(maker, model, price);
        this.TruckLoad = TruckLoad;
    }

    public int getTruckLoad() {
        return TruckLoad;
    }

    public void setTruckLoad(int TruckLoad) {
        this.TruckLoad = TruckLoad;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nhap Truck Load: ");
        setTruckLoad(Integer.parseInt(s.nextLine()));
    }

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Truck Load: "+this.getTruckLoad()); 
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehical;

import java.util.Scanner;

/**
 *
 * @author 609
 */
public class Vehicle implements IVehicle{
String maker;
String model;
double price;
Scanner s = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public Vehicle(String maker, String model, double price) {
        this.maker = maker;
        this.model = model;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public Vehicle() {
    }

    @Override
    public void input() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nhap maker: ");
        this.setMaker(s.nextLine());
        System.out.println("Nhap model: ");
        this.setModel(s.nextLine());
        System.out.println("Nhap Price: ");
        this.setPrice(Integer.parseInt(s.nextLine()));
    }

    @Override
    public void display() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Maker: "+this.getMaker());
        System.out.println("Model: "+this.getModel());
        System.out.println("Price: "+this.getPrice());
    }
    
}

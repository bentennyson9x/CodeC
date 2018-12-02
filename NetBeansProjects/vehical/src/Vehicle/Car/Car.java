package Vehicle.Car;

import java.util.Scanner;
import vehical.Vehicle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 609
 */
public class Car extends Vehicle {
    String color;
Scanner s = new Scanner (System.in);



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, String maker, String model, double price) {
        super(maker, model, price);
        this.color = color;
    }

    public Car() {
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nhap mau: ");
        this.setColor(s.nextLine());
    }

    
    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Mau: "+this.getColor());
    }
    
     
}

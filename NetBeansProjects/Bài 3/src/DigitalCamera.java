/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public abstract class DigitalCamera {
    public String make,Model;
    public float MegaPixel, price;

    public DigitalCamera(String make, String Model, float MegaPixel, float price) {
        this.make = make;
        this.Model = Model;
        this.MegaPixel = MegaPixel;
        this.price = price;
    }

    public DigitalCamera() {
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public float getMegaPixel() {
        return MegaPixel;
    }

    public void setMegaPixel(float MegaPixel) {
        this.MegaPixel = MegaPixel;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public void showDetail(){
        System.out.println("Made in : "+ make+" model: "+Model+" mega pixel: "+MegaPixel+" price: "+price);
    }
    public abstract void capture();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Circle {
    double radius;
    String Color ;

    public Circle(double radius) {
        this.radius=radius;
    }

    public Circle() {
    }

    public Circle(double radius, String Color) {
        this.radius = radius;
        this.Color = Color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
public double getArea(){
    double s=Math.pow(this.radius, 2)*3.14159;
    return s;
}

    @Override
    public String toString() {
        return String.format("Circle[%f,%s]",this.radius,this.Color);
    }


}

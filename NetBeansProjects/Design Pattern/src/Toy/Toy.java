/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy;

import design.pattern.Color;
import design.pattern.Shape;

/**
 *
 * @author saint
 */
public  class Toy {
    Shape shape;
    design.pattern.Color color;

    public Toy(Shape shape, Color color) {
        this.shape = shape;
        this.color = color;
    }
    

    public void display(){
        shape.Draw();
        color.fill();
    }



    
}

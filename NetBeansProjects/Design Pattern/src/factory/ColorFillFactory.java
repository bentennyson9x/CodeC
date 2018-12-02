/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import design.pattern.Color;
import design.pattern.Shape;
import design.pattern.color.Green;
import design.pattern.color.Red;
import design.pattern.color.Yellow;

/**
 *
 * @author saint
 */
public class ColorFillFactory extends AbstractFactory{
   

    @Override
    public Shape getShape(String Shape) {
        return null;
    }

    @Override
    public Color getColor(String Color) {
        if (Color.equalsIgnoreCase("YELLOW")) return new Yellow();
        else if (Color.equalsIgnoreCase("RED")) return new Red();
        else if (Color.equalsIgnoreCase("Green")) return new Green();
        return null;
    }
}

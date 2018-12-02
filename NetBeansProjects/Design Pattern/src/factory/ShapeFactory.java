/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import design.pattern.Color;
import design.pattern.Shape;
import design.pattern.shape.Rectangle;
import design.pattern.shape.Square;
import design.pattern.shape.Circle;
import java.time.LocalDate;
import sun.util.resources.LocaleData;

/**
 *
 * @author saint
 */
public class ShapeFactory extends AbstractFactory{

    /**
     *
     * @param Type
     * @return
     */
   

    @Override
    public Color getColor(String Color) {
        return null;
    }

    @Override
    public Shape getShape(String Shape) {
        if (Shape.equalsIgnoreCase("CIRCLE")) return new Circle();
        else if (Shape.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
        else if (Shape.equalsIgnoreCase("SQUARE")) return new Square();
        return null;
    }
    
    
}

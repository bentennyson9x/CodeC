/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import design.pattern.Color;
import design.pattern.Shape;

/**
 *
 * @author saint
 */
public class GlobalFactory extends AbstractFactory{
    ShapeFactory shapeFactory;
    ColorFillFactory colorFactory;

    public GlobalFactory() {
        shapeFactory = new ShapeFactory();
        colorFactory = new ColorFillFactory();
    }

    

    @Override
    public Color getColor(String Color) {
       return colorFactory.getColor(Color);
    }

    @Override
    public Shape getShape(String Shape) {
        return shapeFactory.getShape(Shape);
    }
    
}

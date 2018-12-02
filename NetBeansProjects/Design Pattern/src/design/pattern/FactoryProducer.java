/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.pattern;

import factory.AbstractFactory;
import factory.ShapeFactory;
import factory.ColorFillFactory;

/**
 *
 * @author saint
 */
public class FactoryProducer {
   
    public static AbstractFactory getFactory (String choice){
        if (choice.equalsIgnoreCase("SHAPE")) return new ShapeFactory();
        if (choice.equalsIgnoreCase("COLOR")) return new ColorFillFactory();
        return null;
    }
    
    
}

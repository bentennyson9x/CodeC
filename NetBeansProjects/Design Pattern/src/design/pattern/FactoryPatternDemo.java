/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.pattern;

import Toy.Toy;
import factory.AbstractFactory;
import factory.GlobalFactory;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp.Factory;

/**
 *
 * @author saint
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.Draw();
        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        Color color1 = colorFactory.getColor("Red");
        color1.fill();
        AbstractFactory shapeColorFactory = new GlobalFactory();
        Toy toy = new Toy(shapeColorFactory.getShape("Circle"), shapeColorFactory.getColor("Red"));
        toy.display();
    }
}

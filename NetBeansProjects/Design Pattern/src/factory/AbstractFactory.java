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
public abstract class AbstractFactory {
    public abstract Color getColor (String Color);
    public abstract Shape getShape(String Shape);
    
}

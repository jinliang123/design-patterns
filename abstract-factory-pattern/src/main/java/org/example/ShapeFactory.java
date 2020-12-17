package org.example;

/**
 * description
 *
 * @author jinliang 2020/12/17 14:02
 */
public class ShapeFactory extends AbstractFactory {

    public Color getColor(String color) {
        return null;
    }

    public Shape getShape(String shape) {
        if(shape == null){
            return null;
        }
        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}

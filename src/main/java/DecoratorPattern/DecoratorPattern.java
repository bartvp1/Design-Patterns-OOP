package DecoratorPattern;

import DecoratorPattern.Shapes.*;
import DecoratorPattern.Decorators.*;

public class DecoratorPattern {

    public static void main(String[] args){
        Shape redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();

        Shape circle = new Circle();
        circle.draw();

        Shape redBlueCircle = new RedShapeDecorator(new BlueShapeDecorator(new Rectangle()));
        redBlueCircle.draw();

        Shape blueRedCircle = new BlueShapeDecorator(new RedShapeDecorator(new Rectangle()));
        blueRedCircle.draw();

    }
}

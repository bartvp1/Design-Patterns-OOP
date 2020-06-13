package DecoratorPattern.Decorators;

import DecoratorPattern.Shapes.Shape;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        addColor("red");
        decoratedShape.draw();
    }
}
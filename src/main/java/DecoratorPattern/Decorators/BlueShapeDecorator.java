package DecoratorPattern.Decorators;

import DecoratorPattern.Shapes.Shape;

public class BlueShapeDecorator extends ShapeDecorator {

    public BlueShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        addColor("blue");
        decoratedShape.draw();
    }


}
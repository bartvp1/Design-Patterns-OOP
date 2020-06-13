package DecoratorPattern.Decorators;

import DecoratorPattern.Shapes.Shape;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }

    @Override
    public void addColor(String s) {
        decoratedShape.addColor(s);
    }

}

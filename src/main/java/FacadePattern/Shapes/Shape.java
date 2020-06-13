package FacadePattern.Shapes;

public interface Shape {

    default void draw() {
        System.out.println("I am a " + getClass().getSimpleName());
    }
}

package DecoratorPattern.Shapes;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class AbstractShape implements Shape {

    ArrayList<String> colors;

    AbstractShape(){
        colors = new ArrayList<>();
    }

    @Override
    public void draw() {
        System.out.println(getClass().getSimpleName() + " { colors: "+ Arrays.toString(colors.toArray()) +" }");
    }

    @Override
    public void addColor(String s) {
        colors.add(s);
    }
}

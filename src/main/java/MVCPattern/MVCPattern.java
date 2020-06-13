package MVCPattern;

import MVCPattern.Person.*;

public class MVCPattern {

    public static void main(String[] args){
        PersonModel model = new PersonModel("Henk",20);
        PersonController controller = new PersonController(model);
        controller.updateView();
        controller.setPersonAge(22);
        controller.updateView();
    }
}

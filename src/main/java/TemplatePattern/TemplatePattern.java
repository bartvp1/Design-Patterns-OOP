package TemplatePattern;

import TemplatePattern.Game.*;

public class TemplatePattern {

    public static void main(String[] args) {
        Game football = new Football();
        football.play();

        Game basketball = new Basketball();
        basketball.play();
    }

}

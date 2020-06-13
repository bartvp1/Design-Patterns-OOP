package TemplatePattern.Game;

public class Basketball extends Game {
    @Override
    void initialize() {
        System.out.println("Initializing Basketball game");
    }

    @Override
    void startPlay() {
        System.out.println("Basketball game started");
    }

    @Override
    void endPlay() {
        System.out.println("Basketball game ended");
    }
}

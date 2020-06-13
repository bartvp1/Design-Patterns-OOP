package TemplatePattern.Game;

public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Initializing Football game");
    }

    @Override
    void startPlay() {
        System.out.println("Football game started");
    }

    @Override
    void endPlay() {
        System.out.println("Football game ended");
    }
}

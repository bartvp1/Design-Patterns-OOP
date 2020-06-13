package AdapterPattern.AdvancedAudioPlayer;

public class Mp3Player implements AdvancedMediaPlayer {
    @Override
    public void playOgg(String filename) {
        System.out.println("Invalid action");
    }

    @Override
    public void playMp3(String filename) {
        System.out.println("Playing ogg file: "+filename);
    }
}

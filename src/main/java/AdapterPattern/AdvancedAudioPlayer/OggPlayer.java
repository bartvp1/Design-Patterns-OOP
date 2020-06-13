package AdapterPattern.AdvancedAudioPlayer;

public class OggPlayer implements AdvancedMediaPlayer {
    @Override
    public void playOgg(String filename) {
        System.out.println("Playing ogg file: "+filename);
    }

    @Override
    public void playMp3(String filename) {
        System.out.println("Invalid action");
    }
}

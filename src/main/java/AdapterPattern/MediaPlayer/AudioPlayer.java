package AdapterPattern.MediaPlayer;

import AdapterPattern.AdapterPattern;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    public AudioPlayer(){
        mediaAdapter = new MediaAdapter();
    }
    @Override
    public void play(String filename) {
        mediaAdapter.play(filename);
    }
}

package AdapterPattern;

import AdapterPattern.MediaPlayer.*;

public class AdapterPattern {

    public static void main(String[] args){

        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("file.mp3");
        audioPlayer.play("file1.ogg");
        audioPlayer.play("file1.mp4");
        audioPlayer.play("file1");

    }

}

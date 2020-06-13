package AdapterPattern.MediaPlayer;

import AdapterPattern.AdvancedAudioPlayer.*;

public class MediaAdapter implements MediaPlayer {
    @Override
    public void play(String filename) {
        AdvancedMediaPlayer player;
        try{
            String fileType = filename.split("\\.")[1];
            switch(fileType.toLowerCase()){
                case "mp3":
                    player = new Mp3Player();
                    player.playMp3(filename);
                    break;
                case "ogg":
                    player = new OggPlayer();
                    player.playOgg(filename);
                    break;
                default:
                    System.out.println("Unsupported file type");
            }
        } catch (Exception e){
            System.out.println("Invalid filename");
        }
    }
}

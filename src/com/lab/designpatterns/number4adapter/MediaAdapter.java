package com.lab.designpatterns.number4adapter;

public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer audioPlayer;

    public MediaAdapter(String mediaType) {

        if (mediaType.equalsIgnoreCase("vlc")) {
            audioPlayer = new VlcPlayer();
        }
        if (mediaType.equalsIgnoreCase("mp4")) {
            audioPlayer = new Mp4Player();
        }

    }

    @Override
    public void play(String mediaType) {

        if (mediaType.equalsIgnoreCase("vlc")) {
            audioPlayer.playVlc();
        }
        if (mediaType.equalsIgnoreCase("mp4")) {
            audioPlayer.playMp4();
        }


    }

}

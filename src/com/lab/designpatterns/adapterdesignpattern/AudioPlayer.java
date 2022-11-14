package com.lab.designpatterns.adapterdesignpattern;

public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;
    @Override
    public void play(String mediaType) {
        if(mediaType.equalsIgnoreCase("mp3")){
            System.out.println("Play mp3");
        }
        
        else if(mediaType.equalsIgnoreCase("vlc") || mediaType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(mediaType);
            mediaAdapter.play(mediaType);
        }
        else {
            System.out.println("Invalid file format");
        }
    }
    

}

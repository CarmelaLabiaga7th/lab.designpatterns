package com.lab.designpatterns.number4adapter;

public class AdapterPatternDemo {
    
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("vlc");
        audioPlayer.play("mp4");
        audioPlayer.play("mp3");
    }

    

}

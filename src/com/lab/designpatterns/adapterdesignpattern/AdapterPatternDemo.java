package com.lab.designpatterns.adapterdesignpattern;

public class AdapterPatternDemo {
    
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("vlc");
        audioPlayer.play("mp4");
        audioPlayer.play("mp3");
    }

    

}

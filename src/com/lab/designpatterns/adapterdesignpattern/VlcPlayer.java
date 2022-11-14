package com.lab.designpatterns.adapterdesignpattern;

public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVlc() {
        System.out.println("Play VLC");
        
    }

    @Override
    public void playMp4() {
        // TODO Auto-generated method stub
        System.out.println("VLC Player - Play mp4");
        
    }
    

}

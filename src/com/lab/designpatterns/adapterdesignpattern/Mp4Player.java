package com.lab.designpatterns.adapterdesignpattern;

public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc() {
        // TODO Auto-generated method stub
        System.out.println("Play VLC");
    }

    @Override
    public void playMp4() {
        // TODO Auto-generated method stub
        System.out.println("Play Mp4");
    }

}

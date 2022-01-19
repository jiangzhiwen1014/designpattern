package com.jzwj.structural_patterns.adapter_pattern;

/**
 * @className: VlcPlayer
 * @description: TODO 类描述
 * @author: jiangzhiwen
 * @date: 2022/1/19
 **/
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
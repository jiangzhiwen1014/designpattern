package com.jzwj.structural_patterns.adapter_pattern;

/**
 * @className: Mp4Player
 * @description: TODO 类描述
 * @author: jiangzhiwen
 * @date: 2022/1/19
 **/
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
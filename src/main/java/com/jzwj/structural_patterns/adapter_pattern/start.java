package com.jzwj.structural_patterns.adapter_pattern;

/**
 * @className: start
 * @description: TODO 类描述
 * @author: jiangzhiwen
 * @date: 2022/1/19
 **/
public class start {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
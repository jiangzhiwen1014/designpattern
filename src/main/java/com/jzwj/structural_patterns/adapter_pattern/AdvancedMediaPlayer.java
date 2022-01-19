package com.jzwj.structural_patterns.adapter_pattern;

/**
 * @className: AdvancedMediaPlayer
 * @description: TODO 类描述
 * @author: jiangzhiwen
 * @date: 2022/1/19
 **/
public interface AdvancedMediaPlayer {
    public void playVlc(String fileName);
    public void playMp4(String fileName);
}
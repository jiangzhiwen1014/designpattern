package com.jzwj.creation_pattern.builder_pattern;

/**
 * @className: Bottle
 * @description: TODO 类描述
 * @author: jiangzhiwen
 * @date: 2022/1/18
 **/
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
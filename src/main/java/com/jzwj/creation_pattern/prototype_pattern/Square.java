package com.jzwj.creation_pattern.prototype_pattern;

/**
 * @className: Square
 * @description: TODO 类描述
 * @author: jiangzhiwen
 * @date: 2022/1/18
 **/
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
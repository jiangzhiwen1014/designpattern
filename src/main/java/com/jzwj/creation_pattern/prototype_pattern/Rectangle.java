package com.jzwj.creation_pattern.prototype_pattern;

/**
 * @className: Rectangle
 * @description: TODO 类描述
 * @author: jiangzhiwen
 * @date: 2022/1/18
 **/
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
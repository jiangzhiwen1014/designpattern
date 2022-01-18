package com.jzwj.creation_pattern.prototype_pattern;

/**
 * @className: Circle
 * @description: TODO 类描述
 * @author: jiangzhiwen
 * @date: 2022/1/18
 **/
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
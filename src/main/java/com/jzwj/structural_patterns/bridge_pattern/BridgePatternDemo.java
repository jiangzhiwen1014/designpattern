package com.jzwj.structural_patterns.bridge_pattern;

/**
 * @className: BridgePatternDemo
 * @description: TODO 类描述
 * @author: jiangzhiwen
 * @date: 2022/1/19
 **/
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
package com.jzwj.creation_pattern.builder_pattern;

/**
 * @className: Item
 * @description: TODO 类描述
 * @author: jiangzhiwen
 * @date: 2022/1/18
 **/
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
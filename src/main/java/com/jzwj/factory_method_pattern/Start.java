package com.jzwj.factory_method_pattern;

/**
 * @className: Start
 * @description: link_url:https://www.runoob.com/design-pattern/factory-pattern.html
 * @author: jiangzhiwen
 * @date: 2021/12/31
 **/
public class Start {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.getAnimal(AnimalEnum.Elephant);
        animal.say();
    }
}

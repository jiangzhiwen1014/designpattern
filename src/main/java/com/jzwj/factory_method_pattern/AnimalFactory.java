package com.jzwj.factory_method_pattern;

/**
 * @className: AnimalFactory
 * @description: TODO 类描述
 * @author: jiangzhiwen
 * @date: 2021/12/31
 **/
public class AnimalFactory {

    public Animal getAnimal(AnimalEnum animal) {
        if (animal == null) {
            return null;
        }
        if (AnimalEnum.Elephant.equals(animal)) {
            return new Elephant();
        } else if (AnimalEnum.Tiger.equals(animal)) {
            return new Tiger();
        } else {
            return null;
        }
    }

}

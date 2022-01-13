package com.jzwj.factory_method_pattern;

/**
 * @className: Elephant
 * @description: TODO 类描述
 * @author: jiangzhiwen
 * @date: 2021/12/31
 **/
public class Elephant implements Animal {
  @Override
  public void say() {
    System.out.println("Elephant： say hello");
  }
}

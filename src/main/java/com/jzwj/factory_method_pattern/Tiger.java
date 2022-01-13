package com.jzwj.factory_method_pattern;

/**
 * @className: Tiger
 * @description: 老虎
 * @author: jiangzhiwen
 * @date: 2021/12/31
 **/
public class Tiger implements Animal {

  @Override
  public void say() {
    System.out.println("Tiger： say hello");
  }
}

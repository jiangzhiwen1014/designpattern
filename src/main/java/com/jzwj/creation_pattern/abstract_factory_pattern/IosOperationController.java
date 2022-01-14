package com.jzwj.creation_pattern.abstract_factory_pattern;

/**
 * @className: IosOperationController
 * @description: TODO 类描述
 * @author: jiangzhiwen
 * @date: 2022/1/14
 **/
public class IosOperationController implements OperationController {
    @Override
    public void control() {
        System.out.println("IosOperationController");
    }
}


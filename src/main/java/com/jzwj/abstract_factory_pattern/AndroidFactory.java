package com.jzwj.abstract_factory_pattern;

/**
 * @className: AndroidFactory
 * @description: TODO 类描述
 * @author: jiangzhiwen
 * @date: 2022/1/14
 **/
public class AndroidFactory implements SystemFactory {
    @Override
    public OperationController createOperationController() {
        return new AndroidOperationController();
    }

    @Override
    public UiController createInterfaceController() {
        return new AndroidUIController();
    }
}
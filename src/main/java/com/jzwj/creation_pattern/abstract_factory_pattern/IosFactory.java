package com.jzwj.creation_pattern.abstract_factory_pattern;

/**
 * @className: IosFactory
 * @description: TODO 类描述
 * @author: jiangzhiwen
 * @date: 2022/1/14
 **/
public class IosFactory implements SystemFactory {
    @Override
    public OperationController createOperationController() {
        return new IosOperationController();
    }

    @Override
    public UiController createInterfaceController() {
        return new IosUIController();
    }
}
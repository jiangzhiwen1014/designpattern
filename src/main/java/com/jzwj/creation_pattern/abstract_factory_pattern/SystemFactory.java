package com.jzwj.creation_pattern.abstract_factory_pattern;

/**
 * @className: SystemFactory
 * @description: TODO 类描述
 * @author: jiangzhiwen
 * @date: 2022/1/14
 **/
public interface SystemFactory {
    public OperationController createOperationController();
    public UiController createInterfaceController();
}
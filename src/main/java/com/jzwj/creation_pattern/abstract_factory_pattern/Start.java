package com.jzwj.creation_pattern.abstract_factory_pattern;

/**
 * @className: Start
 * @description: link_url:https://www.jianshu.com/p/83ef48ce635b
 * @author: jiangzhiwen
 * @date: 2022/1/14
 **/
public class Start {
    public static void main(String[] args) {
        SystemFactory mFactory;
        UiController interfaceController;
        OperationController operationController;

        //Android
        mFactory = new AndroidFactory();
        //Ios
        mFactory = new IosFactory();

        interfaceController = mFactory.createInterfaceController();
        operationController = mFactory.createOperationController();
        interfaceController.display();
        operationController.control();
    }
}

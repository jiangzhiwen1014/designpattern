package com.jzwj.abstract_factory_pattern;

public class AndroidUIController implements UiController {
    @Override
    public void display() {
        System.out.println("AndroidInterfaceController");
    }
}

package com.jzwj.creation_pattern.abstract_factory_pattern;

public class IosUIController implements UiController {
    @Override
    public void display() {
        System.out.println("IosInterfaceController");
    }
}

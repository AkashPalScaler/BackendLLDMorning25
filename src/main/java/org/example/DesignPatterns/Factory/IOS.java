package org.example.DesignPatterns.Factory;

import org.example.DesignPatterns.Factory.Components.IOSInputComponentFactory;
import org.example.DesignPatterns.Factory.Components.InputComponentFactory;

public class IOS extends Platform{
    @Override
    InputComponentFactory createInputComponentFactory() {
        return new IOSInputComponentFactory();
    }
}

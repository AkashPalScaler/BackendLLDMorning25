package org.example.DesignPatterns.Factory;

import org.example.DesignPatterns.Factory.Components.AndroidInputComponentFactory;
import org.example.DesignPatterns.Factory.Components.InputComponentFactory;

public class Android extends Platform{
    @Override
    InputComponentFactory createInputComponentFactory() {
        return new AndroidInputComponentFactory();
    }
}

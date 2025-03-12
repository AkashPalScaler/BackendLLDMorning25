package org.example.DesignPatterns.Factory;

//import org.example.DesignPatterns.Factory.Components.ContainerComponentFactory;
import org.example.DesignPatterns.Factory.Components.InputComponentFactory;

public abstract class Platform {
    void setTheme(){

    }
    void setRefreshRate(){

    }

    abstract InputComponentFactory createInputComponentFactory();

//    abstract ContainerComponentFactory createContainerComponentFactory();

//    abstract AllComponentFactoryOfFactory createFactoryOfFactory();
}

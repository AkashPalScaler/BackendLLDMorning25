package org.example.DesignPatterns.Factory;

import org.example.DesignPatterns.Factory.Components.Button.AndroidButton;
import org.example.DesignPatterns.Factory.Components.Button.Button;
import org.example.DesignPatterns.Factory.Components.Checkbox.Checkbox;
import org.example.DesignPatterns.Factory.Components.ContainerComponentFactory;
import org.example.DesignPatterns.Factory.Components.Dropdown.Dropdown;
import org.example.DesignPatterns.Factory.Components.InputComponentFactory;

public class Client {
    public static void main(String[] args) {

        String platformName = args[0]; // "Android"


        Platform p = PlatformFactory.getPlatform(platformName);

        InputComponentFactory icf = p.createInputComponentFactory();
        ContainerComponentFactory ccf = p.createContainerComponentFactory();

        Button b = icf.createButton();
        Checkbox c  = icf.createCheckbox();
        Dropdown d = icf.createDropdown();

        //Ui Library - ContainerComponents
        // Div, Span, html, header, foooter

        //Additional factory of factory code
//        AllComponentFactoryOfFactory BigFactory = p.createFactoryOfFactory();
//        InputComponentFactory icf = BigFactory.createInputComponentFactory();
    }
}

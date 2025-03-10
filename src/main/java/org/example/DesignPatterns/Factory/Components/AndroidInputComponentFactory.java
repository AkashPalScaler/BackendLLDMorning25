package org.example.DesignPatterns.Factory.Components;

import org.example.DesignPatterns.Factory.Components.Button.AndroidButton;
import org.example.DesignPatterns.Factory.Components.Button.Button;
import org.example.DesignPatterns.Factory.Components.Checkbox.AndroidCheckbox;
import org.example.DesignPatterns.Factory.Components.Checkbox.Checkbox;
import org.example.DesignPatterns.Factory.Components.Dropdown.AndroidDropdown;
import org.example.DesignPatterns.Factory.Components.Dropdown.Dropdown;

public class AndroidInputComponentFactory extends InputComponentFactory{

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new AndroidCheckbox();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}

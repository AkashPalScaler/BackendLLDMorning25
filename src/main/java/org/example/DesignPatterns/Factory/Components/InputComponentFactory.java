package org.example.DesignPatterns.Factory.Components;

import org.example.DesignPatterns.Factory.Components.Button.Button;
import org.example.DesignPatterns.Factory.Components.Checkbox.Checkbox;
import org.example.DesignPatterns.Factory.Components.Dropdown.Dropdown;

public abstract class InputComponentFactory {
    public abstract Button createButton();
    public abstract Checkbox createCheckbox();
    public abstract Dropdown createDropdown();
}
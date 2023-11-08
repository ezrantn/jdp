package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.Buttons.Buttons;
import AbstractFactoryPattern.Checkboxes.Checkbox;

public interface GUIFactory {
    Buttons createButton();
    Checkbox createCheckbox();
}

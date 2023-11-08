package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.Buttons.Buttons;
import AbstractFactoryPattern.Buttons.MacOSButton;
import AbstractFactoryPattern.Checkboxes.Checkbox;
import AbstractFactoryPattern.Checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Buttons createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

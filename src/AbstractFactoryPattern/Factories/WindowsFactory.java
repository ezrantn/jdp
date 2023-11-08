package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.Buttons.Buttons;
import AbstractFactoryPattern.Buttons.WindowsButton;
import AbstractFactoryPattern.Checkboxes.Checkbox;
import AbstractFactoryPattern.Checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Buttons createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

package AbstractFactoryPattern.Application;

import AbstractFactoryPattern.Buttons.Buttons;
import AbstractFactoryPattern.Checkboxes.Checkbox;
import AbstractFactoryPattern.Factories.GUIFactory;

public class Application {
    private Buttons buttons;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        buttons = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        buttons.paint();
        checkbox.paint();
    }
}

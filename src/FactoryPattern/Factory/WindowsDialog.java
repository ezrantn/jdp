package FactoryPattern.Factory;

import FactoryPattern.Buttons.Button;
import FactoryPattern.Buttons.WindowButton;

public class WindowsDialog extends DIalog {
    public Button createButton() {
        return new WindowButton();
    }
}

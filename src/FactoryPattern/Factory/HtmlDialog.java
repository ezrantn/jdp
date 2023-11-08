package FactoryPattern.Factory;

import FactoryPattern.Buttons.Button;
import FactoryPattern.Buttons.HtmlButton;

public class HtmlDialog extends DIalog {
    public Button createButton() {
        return new HtmlButton();
    }
}

package FactoryPattern.Factory;

import FactoryPattern.Buttons.Button;

public abstract class DIalog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}

package MediatorPattern.Components;

import java.awt.event.KeyEvent;

import javax.swing.JTextField;

import MediatorPattern.Mediator.Mediator;

public class Title extends JTextField implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.markNote();
    }

    @Override
    public String getName() {
        return "Title";
    }
}

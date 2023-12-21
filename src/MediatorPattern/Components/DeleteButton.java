package MediatorPattern.Components;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import MediatorPattern.Mediator.Mediator;

public class DeleteButton extends JButton implements Component {
    private Mediator mediator;

    public DeleteButton() {
        super("Del");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.deleteNote();
    }

    @Override
    public String getName() {
        return "DelButton";
    }
}

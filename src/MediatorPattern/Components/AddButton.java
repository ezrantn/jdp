package MediatorPattern.Components;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import MediatorPattern.Mediator.Mediator;
import MediatorPattern.Mediator.Note;

public class AddButton extends JButton implements Component {
    private Mediator mediator;

    public AddButton() {
        super("Add");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.addNewNote(new Note());
    }

    @Override
    public String getName() {
        return "AddButton";
    }
}

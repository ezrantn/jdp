package MediatorPattern.App;

import javax.swing.DefaultListModel;

import MediatorPattern.Components.AddButton;
import MediatorPattern.Components.DeleteButton;
import MediatorPattern.Components.Filter;
import MediatorPattern.Components.List;
import MediatorPattern.Components.SaveButton;
import MediatorPattern.Components.TextBox;
import MediatorPattern.Components.Title;
import MediatorPattern.Mediator.Editor;
import MediatorPattern.Mediator.Mediator;

public class MediatorApp {
    public static void main(String[] args) {
        Mediator mediator = new Editor();
        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());
        mediator.createGUI();
    }
}

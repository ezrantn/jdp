package CommandPattern.editor;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.foreign.FunctionDescriptor;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

import CommandPattern.Commands.Command;
import CommandPattern.Commands.CommandHistory;
import CommandPattern.Commands.CopyCommand;
import CommandPattern.Commands.CutCommand;
import CommandPattern.Commands.PasteCommand;

public class Editor {
    public JTextArea textField;
    public String clipboard;
    public CommandHistory history = new CommandHistory();

    public void init() {
        JFrame jFrame = new JFrame("Text editor (type & use buttons, Luke!)");
        JPanel content = new JPanel();
        jFrame.setContentPane(content);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        textField = new JTextArea();
        textField.setLineWrap(true);
        content.add(textField);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton ctrlC = new JButton("ctrl + C");
        JButton ctrlX = new JButton("ctrl + X");
        JButton ctrlY = new JButton("ctrl + Y");
        JButton ctrlZ = new JButton("ctrl + Z");
        Editor editor = this;
        ctrlC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new CopyCommand(editor));
            }
        });
        ctrlX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new CutCommand(editor));
            }
        });
        ctrlY.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new PasteCommand(editor));
            }
        });
        ctrlZ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                undo();
            }
        });

        buttons.add(ctrlC);
        buttons.add(ctrlX);
        buttons.add(ctrlY);
        buttons.add(ctrlZ);
        content.add(buttons);
        jFrame.setSize(450, 200);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    private void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    private void undo() {
        if (history.isEmpty()) return;

        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }

}

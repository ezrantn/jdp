package StatePattern.ui;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.util.concurrent.Flow;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UI {
    private Player player;
    private static JTextField textField = new JTextField();
    public UI(Player player) {
        this.player = player;
    }
    public void init() {
        JFrame jFrame = new JFrame("Test player");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel content = new JPanel();
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        jFrame.getContentPane().add(content);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        content.add(textField);
        content.add(buttons);
        JButton play = new JButton("Play");
        play.addActionListener(e -> textField.setText(player.getState().onPlay()));
        JButton stop = new JButton("Stop");
        stop.addActionListener(e -> textField.setText(player.getState().onLock()));
        JButton next = new JButton("Next");
        next.addActionListener(e -> textField.setText(player.getState().onNext()));
        JButton prev = new JButton("Previous");
        prev.addActionListener(e -> textField.setText(player.getState().onPrevious()));
        jFrame.setVisible(true);
        jFrame.setSize(300, 100);
        buttons.add(play);
        buttons.add(stop);
        buttons.add(next);
        buttons.add(prev);
    }
}

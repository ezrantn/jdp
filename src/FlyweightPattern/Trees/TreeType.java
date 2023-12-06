package FlyweightPattern.Trees;

import java.awt.*;

public class TreeType {
    private String name;
    private Color color;
    private String otherTreeData;

    public TreeType(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void draw(Graphics graphics, int x, int y) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(x - 1, y, 3, 5);
        graphics.setColor(color);
        graphics.fillOval(x - 5, y -10, 10, 10);
    }
}

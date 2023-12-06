package FlyweightPattern.Trees;

import java.awt.*;

public class Tree {
    private int x;
    private int y;
    private TreeType treeType;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.treeType = type;
    }

    public void draw(Graphics graphics) {
        treeType.draw(graphics, x, y);
    }
}

package VisitorPattern.Shapes;

import VisitorPattern.Visitor.Visitor;

public class Circle extends Dot {
    private int radius;
    public Circle(int id, int x, int y, int radius) {
        super(id, x, y);
        this.radius = radius;
    }

    public String accept(Visitor visitor) {
        return visitor.visitCircle(this);
    }

    public int getRadius() {
        return radius;
    }
}

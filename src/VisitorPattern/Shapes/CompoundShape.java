package VisitorPattern.Shapes;

import java.util.ArrayList;
import java.util.List;

import VisitorPattern.Visitor.Visitor;

public class CompoundShape implements Shape {
    public int id;
    public List<Shape> children = new ArrayList<>();
    public CompoundShape(int id) {
        this.id = id;
    }

    public void move(int x, int y) {
        // move shape
    }

    public void draw() {
        // move shape
    }

    public int getId() {
        return id;
    }

    public String accept(Visitor visitor) {
        return visitor.visitCompoundGraphic(this);
    }

    public void add(Shape shape) {
        children.add(shape);
    }
}

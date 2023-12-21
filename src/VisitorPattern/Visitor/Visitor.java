package VisitorPattern.Visitor;

import VisitorPattern.Shapes.Circle;
import VisitorPattern.Shapes.CompoundShape;
import VisitorPattern.Shapes.Dot;
import VisitorPattern.Shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);
    String visitCircle(Circle circle);
    String visitRectangle(Rectangle rectangle);
    String visitCompoundGraphic(CompoundShape compoundShape);
}

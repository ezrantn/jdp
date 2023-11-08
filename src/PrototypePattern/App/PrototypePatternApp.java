package PrototypePattern.App;

import PrototypePattern.Shapes.Circle;
import PrototypePattern.Shapes.Rectangle;
import PrototypePattern.Shapes.Shapes;

import javax.swing.plaf.metal.MetalIconFactory;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PrototypePatternApp {
    public static void main(String[] args) {
        List<Shapes> shapes = new ArrayList<>();
        List<Shapes> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void  cloneAndCompare(List<Shapes> shapes, List<Shapes> shapesCopy) {
        for (Shapes shape: shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ", Shapes are different object (yay)") ;
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ", And they are identical (yay)");
                } else {
                    System.out.println(i + ", But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ", Shape object are the same (booo!)");
            }
        }
    }

}

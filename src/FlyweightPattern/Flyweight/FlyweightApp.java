package FlyweightPattern.Flyweight;

import FlyweightPattern.Forrest.Forrest;

import javax.print.attribute.standard.PrinterMakeAndModel;
import java.awt.*;

public class FlyweightApp {
    static int CANVAS_SIZE = 500;
    static int TREES_TO_DRAW = 1000_000;
    static int TREE_TYPE = 2;

    public static void main(String[] args) {
        Forrest forrest = new Forrest();
        System.out.println(Math.floor(TREES_TO_DRAW / TREE_TYPE));
        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPE); i++) {
            forrest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer Oak", Color.GREEN, "Oak Texture stub");
            forrest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Autumn Oak", Color.RED, "Autumn Oak Texture stub");
            forrest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Blue Oak", Color.BLUE,"Blue Oak Texture stub");
        }
        forrest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forrest.setVisible(true);
        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("--------------------");
        System.out.println("Memory usage:");
        System.out.println("Trees size (8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPE + "");
        System.out.println("--------------------");
        System.out.println("Total: " + ((TREES_TO_DRAW * 8 * TREE_TYPE * 30) / 1024 / 1024) + "MB (instead of " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

}

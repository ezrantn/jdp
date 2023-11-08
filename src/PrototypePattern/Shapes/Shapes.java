package PrototypePattern.Shapes;

import java.util.Objects;

public abstract class Shapes {
    public int x;
    public int y;
    public String color;

    public Shapes() {

    }

    public Shapes(Shapes target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shapes clone();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Shapes)) return false;
        Shapes shape2 = (Shapes) obj;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}

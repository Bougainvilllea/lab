package geometry3d;

import geometry2d.Circle;
import geometry2d.Rectangle;

public class Cylinder {
    Circle circle;
    Rectangle rect;
    public Cylinder(double radius_cylinder, double a_cylinder) {
        circle = new Circle(radius_cylinder);
        rect = new Rectangle(a_cylinder, 0);
        
    }

    public Double volume() {
        return circle.area() * rect.a;
    }
}

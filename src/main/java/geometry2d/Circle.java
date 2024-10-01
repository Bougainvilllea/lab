package geometry2d;

public class Circle {
    double radius;
    public Circle(double radius_circle){
         radius = radius_circle;
    }
    public Double area() {
        return 3.14 * radius * radius;
    }
    public String toString(){

        return "Circle: " + radius;
    }
}

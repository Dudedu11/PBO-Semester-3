package Inheritance;

/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle { // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius;
    private double height;
    private String color;


    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        radius = 1.0;
        height = 1.0;
        color = "red";
    }
    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r, double h, String red) { // 2nd constructor
        radius = r;
        height = h;
        color = "red";
    }
    /** Returns the radius */
    public double getRadius() {
        return radius;
    }
    public double getHeight(){
        return height;
    }
    public String gerColor(){
        return color;
    }

    public void setColor(String newColor){
        color = newColor;
    }
    public void setHeight(double newHeight){
        height = newHeight;
    }

    public void setRadius(double newRadius){
        radius = newRadius;
    }
    /** Returns the area of this Circle instance */
    public double getArea() {
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
                //radius*radius*Math.PI;
    }
    /** Return a self-descriptive string of this instance in the form of
     Circle[radius=?,color=?] */
    public String toString() {
            return "Circle[radius=" + radius + " color=" + color + "]";
    }
}

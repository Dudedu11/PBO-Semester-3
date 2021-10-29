package Inheritance;

public class Cylinder extends Circle { // Save as "Cylinder.java"
    private double height; // private variable
    private double radius;
//    // Constructor with default color, radius and height
    public Cylinder() {
        super(); // call superclass no-arg constructor Circle()
        radius = 1.0;
        height = 1.0;
    }
    // Constructor with default radius, color but given height
    public Cylinder(double radius,double height) {
        super(); // call superclass no-arg constructor Circle()
        this.radius = radius;
        this.height = height;
    }
    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height, String color) {
        super(radius, height, color); // call superclass constructor Circle(r)
        this.radius = radius;
        this.height = height;
    }
    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }
    public double getRadius() {
        return radius;
    }
    // A public method for computing the volume of cylinder
// use superclass method getArea() to get the base area
    public double getVolume() {
        return ((super.getArea() - 2*Math.PI*radius*height)/2)*height ;
    }

    public String toString() { // in Cylinder class
        return "Cylinder: subclass of " + super.toString() // use Circle's toString()
                + " height=" + height;

    }
}

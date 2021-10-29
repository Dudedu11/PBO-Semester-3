package Inheritance;

public class Rectangle extends Shape{

    private double width;
    private double length;

    public Rectangle(){
        super();
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double w, double l){
        super();
        width = w;
        length = l;
    }

    public Rectangle(String color, boolean filled, double width, double length){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return width+width+length+length;
    }

    public String toString(){
        return  "A Rectangle with width="+width
                +" and length="+length+", which is a subclass of"+ super.toString();
    }
}

package Inheritance;

public class Shape {
    private String color;
    private boolean filled;

    public Shape(){
        color = "green";
        filled = true;
    }

    public Shape(String g, boolean t){
        color = g;
        filled = t;
    }

    public String getColor(){
        return color;
    }
    public boolean getFilled(){
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(){
        return "A shape with color of green and filled";
    }
}

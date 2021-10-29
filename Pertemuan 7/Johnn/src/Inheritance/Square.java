package Inheritance;

public class Square extends Rectangle{

    public Square (){
        super();
        double side = 1.0;
    }
    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(color, filled, side, side);
    }

    public double getSide(){
        return super.getLength();
    }

    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }

    public double getArea()
    {
        return getSide()*getSide();
    }

    public double getPerimeter()
    {
        return 4*getSide();
    }

    public String toSting(){
        return "A Square with side="+getSide()+", which is a subclass of "+super.toString();
    }

}

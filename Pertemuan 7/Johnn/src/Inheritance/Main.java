package Inheritance;

public class Main {
    public static void main (String[] args){
        Square s1 = new Square();
        System.out.println("Square"
        + " side = "+ s1.getSide()
        + " base area = "+s1.getArea()
        + " perimeter = "+s1.getPerimeter());

        Square s2 = new Square(10);
        System.out.println("Square"
                + " side = "+ s2.getSide()
                + " base area = "+s2.getArea()
                + " perimeter = "+s2.getPerimeter());

        Rectangle r1 = new Rectangle();
        System.out.println("Rectangle"
                + " width = "+ r1.getWidth()
                + " length = "+r1.getLength()
                + " base area = "+r1.getArea()
                + " perimeter = "+r1.getPerimeter());

        Rectangle r2 = new Rectangle(10,10);
        System.out.println("Rectangle"
                + " width = "+ r2.getWidth()
                + " length = "+ r2.getLength()
                + " base area = "+r2.getArea()
                + " perimeter = "+r2.getPerimeter());

        Circle c1 = new Circle();
        System.out.println("Cylinder:"
                + " radius = " + c1.getRadius()
                + " base area = " + c1.getArea()
                + " volume = " + c1.getPerimeter());


        Circle c2 = new Circle(10.0);
        System.out.println("Cylinder:"
                + " radius = " + c2.getRadius()
                + " base area = " + c2.getArea()
                + " perimeter = " + c2.getPerimeter());

    }
}

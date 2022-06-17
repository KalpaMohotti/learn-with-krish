package Real_example;


public class Test {


    public static void main(String[] args) {
        Circle c1 = new Circle(new Red());
        c1.draw();

        Circle c2 = new Circle(new Blue());
        c2.draw();

        Rectangle r1 = new Rectangle(new Red());
        r1.draw();
    }

}

abstract class Shape {

    Colour colour;

    public Shape(Colour colour) {
        this.colour = colour;
    }

    public abstract void draw();
}

interface Colour {  //If we want we can use this class as a abstract class

    public abstract void fill();
}

class Circle extends Shape {

    public Circle(Colour colour) {
        super(colour);
    }

    @Override
    public void draw() {
        System.out.println("Circle draw");
        colour.fill();
    }

}

class Rectangle extends Shape {

    public Rectangle(Colour colour) {
        super(colour);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle draw");
        colour.fill();
    }

}

class Red implements Colour {

    @Override
    public void fill() {
        System.out.println("Fill Red colour");
    }

}

class Blue implements Colour {

    @Override
    public void fill() {
        System.out.println("Fill Blue Colour");
    }

}

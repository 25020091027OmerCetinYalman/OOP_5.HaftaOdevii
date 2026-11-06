package Odev;

interface Colorable {
    void howToColor();
}

public class Square extends GeometricObject implements Colorable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public double getArea() { return side * side; }

    @Override
    public double getPerimeter() { return 4 * side; }
}
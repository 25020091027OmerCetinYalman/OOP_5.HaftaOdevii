package Odev;

public class Octagon extends GeometricObject implements Cloneable {
    private double side;

    public Octagon(double side) { 
        this.side = side; 
    }

    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter() { 
        return 8 * side; 
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(GeometricObject o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}
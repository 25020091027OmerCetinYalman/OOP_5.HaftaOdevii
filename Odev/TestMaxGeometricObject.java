package Odev;

public class TestMaxGeometricObject {
    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        if (o1.compareTo(o2) > 0)
            return o1;
        else
            return o2;
    }
}
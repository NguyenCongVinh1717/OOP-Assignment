
package Chuong3.Circle;

public class Circle implements GeometricObject {
    protected double radius=1.0;

    public Circle(double radius) {
        this.radius=radius;
    }
    @Override
    public double getPerimeter() {
        double p=2*3.14*this.radius;
        return p;
    }

    @Override
    public double getArea() {
        double s=3.14*this.radius*this.radius;
        return s;
        
    }

// Just for testing
    
}

package week2;

public class Circle {
    private double radius;

    protected double getRadius() {
        return radius;
    }
    protected void setRadius(double value)  {
        if( radius < 0 )
            radius = 0.00;
        else
            radius = value;
    }
    protected double calculateDiameter() {
        return radius * 2;
    }
    protected double calculateCircumference() {
        return calculateDiameter() * 3.14159;
    }
    protected double calculateArea() {
        return radius * radius * 3.14159;
    }
}



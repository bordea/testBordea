package week2;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }
    public void setRadius(double value)  {
        if( radius < 0 )
            radius = 0.00;
        else
            radius = value;
    }
    public double calculateDiameter() {
        return radius * 2;
    }
    public double calculateCircumference() {
        return calculateDiameter() * 3.14159;
    }
    public double calculateArea() {
        return radius * radius * 3.14159;
    }
}



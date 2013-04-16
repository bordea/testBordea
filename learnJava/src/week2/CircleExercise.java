package week2;

public class CircleExercise {
    public static void main(String[] args) {
        Circle round = new Circle();
        round.setRadius(25.55);
        System.out.println("Circle Characteristics");
        System.out.printf("Side:          %f\n", round.getRadius());
        System.out.printf("Diameter:      %f\n", round.calculateDiameter());
        System.out.printf("Circumference: %f\n", round.calculateCircumference());
        System.out.printf("Area:          %f\n", round.calculateArea());
    }
}

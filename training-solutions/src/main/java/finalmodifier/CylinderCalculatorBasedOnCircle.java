package finalmodifier;

public class CylinderCalculatorBasedOnCircle {

    CircleCalculator circle = new CircleCalculator();
    public double calculateVolume (double r,double h){
        return circle.calculateArea(r)*h;
    }

    public double calculateSurfaceArea (double r,double h){
        return 2* circle.calculateArea(r) + circle.calculatePerimeter(r)*h;
    }
}

public class Ellipse extends Shape {
    private double a;
    private double b;

    public Ellipse(double a, double b) {
        super("Ellipse");
        this.a = Math.max(a, b);
        this.b = Math.min(a, b); 
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * Math.sqrt((a * a + b * b) / 2); 
    }
}

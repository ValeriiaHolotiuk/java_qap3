public class Demo {
    public static void main(String[] args) {
        Scalable[] scalables = new Scalable[4];
        scalables[0] = new Circle(5);
        scalables[1] = new Ellipse(6, 4);
        scalables[2] = new Triangle(3, 4, 5);
        scalables[3] = new EquilateralTriangle(4);

        System.out.println("Before scaling:");
        for (Scalable s : scalables) {
            System.out.println(s);
        }

        scaleAll(scalables, 2.0); 
        
        System.out.println("\nAfter scaling:");
        for (Scalable s : scalables) {
            System.out.println(s);
        }
    }

    public static void scaleAll(Scalable[] arr, double factor) {
        for (Scalable s : arr) {
            s.scale(factor);
        }
    }
}

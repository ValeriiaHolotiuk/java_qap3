public class Demo {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(2.5f, 3.0f, 1.5f, -0.5f);
        System.out.println("Before move: " + p);
        p.move();
        System.out.println("After move: " + p);
    }
}

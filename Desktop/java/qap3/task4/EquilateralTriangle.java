public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, side, side);
    }

    @Override
    public String getName() {
        return "EquilateralTriangle";
    }
}

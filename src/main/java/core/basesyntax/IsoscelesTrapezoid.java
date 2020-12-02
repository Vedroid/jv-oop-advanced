package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideUP;
    private double sideDown;
    private double side;
    
    public IsoscelesTrapezoid(double sideUP, double sideDown, double side, Color color) {
        this.sideUP = sideUP;
        this.sideDown = sideDown;
        this.side = side;
        setArea((sideUP + sideDown) / 2 * Math.sqrt(side * side
                - Math.pow(sideUP - sideDown, 2) / 4));
        setPerimeter(sideUP + sideDown + side + side);
        setColor(color);
    }
    
    public double getDiagonal() {
        return Math.sqrt(sideUP * sideDown + side * side
                + ((sideDown * (side * side - side * side) / sideDown - sideUP)));
    }
    
    @Override
    public void draw() {
        System.out.println("Draw isosceles trapezoid");
    }
    
    @Override
    public String getParameters() {
        return String.format("IsoscelesTrapezoid, sideUP: %f units, sideDown: %f units, "
                        + "side: %f units, area: %f sq. units, perimeter: %f units, "
                        + "diagonal: %f units, color: %s",
                sideUP, sideDown, side, getArea(), getPerimeter(),getDiagonal(), getColor());
    }
}

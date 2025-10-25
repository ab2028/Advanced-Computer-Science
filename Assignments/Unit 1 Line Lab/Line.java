public class Line {
    private int a;
    private int b;
    private int c;
    private Point p1;
    private Point p2;

    public Line() {
        this.a = (int) (10 * Math.random()); // 0 to 9
        this.b = (int) (10 * Math.random());
        this.c = (int) (10 * Math.random());
    }

    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Line(Point p1, Point p2) {
        // a = - (y2 - y1)
        this.a = -(p2.getY() - p1.getY());

        // b = x2 - x1
        this.b = p2.getX() - p1.getX();

        // c = - (a * x1 + b * y1)
        this.c = -(this.a * p1.getX() + p1.getY() * this.b);

        this.p1 = p1;
        this.p2 = p2;
    }

    public double calculateSlope() {
        return (double) -a / b;
    }

    public double calculateSlopeFromPoints() {
        return (double) (p1.getY() - p2.getY()) / (p1.getX() - p2.getX());
    }

    public String generatePointSlopeFormula() {
        return "(y - " + p1.getY() + ") = " + calculateSlopeFromPoints() + "(x - " + p1.getX()
                + ")";
    }

    public boolean isCoordinateOnLine(Point p) {
        return a * p.getX() + b * p.getY() + c == 0;
    }

    public String toString() {
        return "Equation: " + a + "x + " + b + "y + " + c + " = 0";
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }


    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }
}

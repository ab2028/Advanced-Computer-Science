public class Line {
    private int a;
    private int b;
    private int c;

    public Line() {
        this.a = (int) (10*Math.random()); // 0 to 9
        this.b = (int) (10*Math.random());
        this.c = (int) (10*Math.random());
    }

    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    } 

    public double calculateSlope() {
        return (double) -a / b;
    }

    public boolean isCoordinateOnLine(int x, int y) {
        return a * x +  b * y + c == 0;
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
} 
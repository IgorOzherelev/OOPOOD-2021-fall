package points;

public class Point2D {
    private final double x, y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double countSquareDist(Point2D point) {
        return Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

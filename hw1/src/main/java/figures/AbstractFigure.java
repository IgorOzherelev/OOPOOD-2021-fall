package figures;

/**
 * При решении задачи выбран вариант через абстрактный класс, тк через интерфейс
 * поле square будет public static final, что плохо с точки зрения безопасности.
 * */
abstract public class AbstractFigure {
    protected double square = -1;

    public static class Point2D {
        double x, y;

        public Point2D(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double countSquareDist(Point2D point) {
            return Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2);
        }
    }

    abstract public double getSquare();
}

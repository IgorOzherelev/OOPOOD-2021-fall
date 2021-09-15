package figures;

import utils.WrongParameterException;

/**
 * Класс Polygon сделан для работы с многоугольниками.
 * */
public class Polygon extends AbstractFigure {
    protected final int pointsNum;
    protected final Point2D[] points;

    public Polygon(int pointsNum, Point2D[] points) throws NullPointerException, WrongParameterException {
        if (pointsNum <= 2 || pointsNum != points.length) {
            throw new WrongParameterException("Incorrect arguments passed for polygon constructing");
        }

        for (Point2D point : points) {
            if (point == null) {
                throw new NullPointerException("Null point");
            }
        }

        this.pointsNum = pointsNum;
        this.points = points;
    }

    public int getPointsNum() {
        return pointsNum;
    }

    public Point2D[] getPoints() {
        return points;
    }

    /**
     * Shoelace method
     * */
    private void countSquare() {
        double square = 0;
        for (int i = 0; i < pointsNum - 1; i++) {
            square += this.points[i].x * this.points[i + 1].y - this.points[i + 1].x * this.points[i].y;
        }

        square += points[pointsNum - 1].x * points[0].y - points[0].x * points[pointsNum - 1].y;
        this.square = Math.abs(square) / 2.0;
    }

    @Override
    public double getSquare() {
        countSquare();
        return this.square;
    }
}


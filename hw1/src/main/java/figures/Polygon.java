package figures;

import points.Point2D;
import common.exceptions.WrongParameterException;

/**
 * Класс Polygon сделан для работы с многоугольниками.
 * */
public class Polygon implements AreaCalculator {
    protected final int pointsNum;
    protected final Point2D[] points;

    public Polygon(int pointsNum, Point2D[] points) throws WrongParameterException {
        if (pointsNum <= 2 || pointsNum != points.length) {
            throw new WrongParameterException("Incorrect arguments passed for polygon constructing "
                    + "pointsNum: " + pointsNum + "points.length: " + points.length);
        }

        for (Point2D point : points) {
            if (point == null) {
                throw new NullPointerException("Points array contains null point/points");
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
    private double countSquare() {
        double square = 0;
        for (int i = 0; i < pointsNum - 1; i++) {
            square += this.points[i].getX() * this.points[i + 1].getY() - this.points[i + 1].getX() * this.points[i].getY();
        }

        square += points[pointsNum - 1].getX() * points[0].getY() - points[0].getX() * points[pointsNum - 1].getY();
       return Math.abs(square) / 2.0;
    }

    @Override
    public double calculateSquare() {
        return countSquare();
    }
}


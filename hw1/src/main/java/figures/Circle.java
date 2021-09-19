package figures;

import points.Point2D;
import common.exceptions.WrongParameterException;

/**
 * Окружность задается по радиусу и центру.
 * */
public class Circle implements AreaCalculator {
    private final double radius;
    private final Point2D center;

    public Circle(double radius, Point2D center) throws WrongParameterException {
        if (radius <= 0) throw new WrongParameterException("Radius <= 0" + "radius: " + radius);
        this.radius = radius;
        this.center = center;
    }

    @Override
    public double calculateSquare() {
        return Math.PI * Math.pow(radius, 2);
    }
}

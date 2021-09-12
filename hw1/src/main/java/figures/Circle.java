package figures;

import utils.WrongParameterException;

/**
 * Окружность задается по радиусу и центру.
 * */
public class Circle extends AbstractFigure {
    private final double radius;
    private final Point2D center;

    public Circle(double radius, Point2D center) throws WrongParameterException {
        if (radius <= 0) throw new WrongParameterException("Radius <= 0");
        this.radius = radius;
        this.center = center;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }
}

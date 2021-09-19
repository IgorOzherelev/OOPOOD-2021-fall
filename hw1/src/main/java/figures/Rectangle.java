package figures;

import points.Point2D;
import common.utils.GeomUtils;
import common.exceptions.WrongParameterException;

/**
 * Класс Rectangle описывает прямоугольники.
 * Обход вершин по часовой стрелке.
 * */
public class Rectangle extends Polygon {
    public Rectangle(Point2D[] points) throws WrongParameterException {
        super(4, points);

        if (!GeomUtils.isRectangle(points)) {
            throw new WrongParameterException("Not a rectangle: wrong points array");
        }
    }
}

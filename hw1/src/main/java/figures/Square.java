package figures;

import points.Point2D;
import common.utils.GeomUtils;
import common.exceptions.WrongParameterException;

/**
 * Класс Square описывает квадраты
 * Обход вершин по часовой стрелке.
 * */
public class Square extends Rectangle {
    public Square(Point2D[] points) throws WrongParameterException {
        super(points);

        if (!GeomUtils.isSquare(points)) {
            throw new WrongParameterException("Not a square: wrong points array");
        }
    }
}

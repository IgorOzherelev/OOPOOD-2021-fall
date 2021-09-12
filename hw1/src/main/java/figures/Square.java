package figures;

import utils.WrongParameterException;

/**
 * Класс Square описывает квадраты
 * Обход вершин по часовой стрелке.
 * */
public class Square extends Rectangle {
    public Square(Point2D[] points) throws NullPointerException, WrongParameterException {
        super(points);

        if (!isSquare(points)) {
            throw new WrongParameterException("Not a square");
        }
    }

    public static boolean isSquare(Point2D[] points) {
        double[] distances = countDistancesBetweenVertices(points);

        if (distances[0] == 0 || distances[1] == 0 ||
                distances[2] == 0 || distances[3] == 0 ||
                distances[4] == 0 || distances[5] == 0) {
            return false;
        }

        if (distances[0] == distances[1] &&
                distances[0] == distances[2] &&
                distances[0] == distances[3]) {
            return true;
        }

        return false;
    }
}

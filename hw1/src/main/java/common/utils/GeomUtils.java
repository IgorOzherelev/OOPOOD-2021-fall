package common.utils;

import points.Point2D;

final public class GeomUtils {
    private static double[] distances;

    public static double[] countDistancesBetweenVertices(Point2D[] points) {
        double[] distances = new double[6];

        distances[0] = points[0].countSquareDist(points[1]); // d01
        distances[1] = points[2].countSquareDist(points[3]); // d23
        distances[2] = points[0].countSquareDist(points[3]); // d03
        distances[3] = points[1].countSquareDist(points[2]); // d12
        distances[4] = points[0].countSquareDist(points[2]); // d02
        distances[5] = points[1].countSquareDist(points[3]); // d13

        return distances;
    }

    public static boolean isSquare(Point2D[] points) {
        distances = countDistancesBetweenVertices(points);

        return isRectangle(points) && distances[0] == distances[2]
                && distances[0] == distances[3];
    }

    public static boolean isRectangle(Point2D[] points) {
        distances = countDistancesBetweenVertices(points);

        if (distances[0] == 0 || distances[1] == 0 ||
                distances[2] == 0 || distances[3] == 0 ||
                distances[4] == 0 || distances[5] == 0) {
            return false;
        }

        if (distances[0] == distances[1]) {
            if (distances[3] == distances[2]) {
                return distances[4] == distances[5];
            }
        }

        return false;
    }
}

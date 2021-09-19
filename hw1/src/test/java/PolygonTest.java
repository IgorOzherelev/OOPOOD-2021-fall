import figures.Polygon;
import org.junit.Assert;
import org.junit.Test;
import points.Point2D;
import common.exceptions.WrongParameterException;

public class PolygonTest {

    @Test(expected = WrongParameterException.class)
    public void test001_polygonTest_whenNegativePointsNum() throws WrongParameterException {
        Point2D[] points = new Point2D[4];

        points[0] = new Point2D(1.0, 1.0);
        points[1] = new Point2D(1.0, 2.0);
        points[2] = new Point2D(3.0, 2.0);
        points[3] = new Point2D(3.0, 5.0);

        Polygon polygon = new Polygon(-3, points);
    }

    @Test(expected = WrongParameterException.class)
    public void test002_polygonTest_whenWrongPointsNum() throws WrongParameterException {
        Point2D[] points = new Point2D[3];

        points[0] = new Point2D(1.0, 1.0);
        points[1] = new Point2D(1.0, 2.0);
        points[2] = new Point2D(3.0, 2.0);

        Polygon polygon = new Polygon(1, points);
    }

    @Test(expected = WrongParameterException.class)
    public void test003_polygonTest_whenWrongPointsNum() throws WrongParameterException {
        Point2D[] points = new Point2D[3];

        points[0] = new Point2D(1.0, 1.0);
        points[1] = new Point2D(1.0, 2.0);
        points[2] = new Point2D(3.0, 2.0);

        Polygon polygon = new Polygon(4, points);
    }

    @Test(expected = NullPointerException.class)
    public void test004_polygonTest_whenNullPoints() throws WrongParameterException {
        Point2D[] points = new Point2D[3];
        Polygon polygon = new Polygon(3, points);
    }

    @Test
    public void test005_polygonTest_positive() throws WrongParameterException {
        Point2D[] points = new Point2D[3];

        points[0] = new Point2D(1.0, 1.0);
        points[1] = new Point2D(1.0, 2.0);
        points[2] = new Point2D(3.0, 2.0);

        Polygon polygon = new Polygon(3, points);
    }

    @Test
    public void test006_polygonTest_squareTest_positive() throws WrongParameterException {
        Point2D[] points = new Point2D[3];

        points[0] = new Point2D(1.0, 1.0);
        points[1] = new Point2D(1.0, 2.0);
        points[2] = new Point2D(3.0, 2.0);

        Polygon polygon = new Polygon(3, points);

        Assert.assertEquals(1.0, polygon.calculateSquare(), 0.01);
    }
}
import figures.Square;
import org.junit.Assert;
import org.junit.Test;
import points.Point2D;
import common.exceptions.WrongParameterException;

public class SquareTest {
    @Test(expected = WrongParameterException.class)
    public void test001_squareTest_whenWrongPoints() throws WrongParameterException {
        Point2D[] points = new Point2D[4];

        points[0] = new Point2D(1.0, 1.0);
        points[1] = new Point2D(1.0, 2.0);
        points[2] = new Point2D(2.0, 2.0);
        points[3] = new Point2D(2.0, 22.0);

        Square square = new Square(points);
    }

    @Test(expected = NullPointerException.class)
    public void test002_squareTest_whenNullPoints() throws WrongParameterException {
        Point2D[] points = new Point2D[4];
        Square square = new Square(points);
    }

    @Test(expected = WrongParameterException.class)
    public void test003_squareTest_whenWrongPointsNumber() throws WrongParameterException {
        Point2D[] points = new Point2D[5];

        points[0] = new Point2D(1.0, 1.0);
        points[1] = new Point2D(1.0, 2.0);
        points[2] = new Point2D(2.0, 2.0);
        points[3] = new Point2D(2.0, 2.0);
        points[4] = new Point2D(2.0, 22.0);

        Square square = new Square(points);
    }

    @Test
    public void test004_squareTest_positive() throws WrongParameterException {
        Point2D[] points = new Point2D[4];

        points[0] = new Point2D(1.0, 1.0);
        points[1] = new Point2D(1.0, 2.0);
        points[2] = new Point2D(2.0, 2.0);
        points[3] = new Point2D(2.0, 1.0);

        Square square = new Square(points);

        Assert.assertEquals(1.0, square.calculateSquare(), 0.01);
    }

    @Test(expected = WrongParameterException.class)
    public void test005_squareTest_whenRectangle() throws WrongParameterException {
        Point2D[] points = new Point2D[4];

        points[0] = new Point2D(1.0, 1.0);
        points[1] = new Point2D(1.0, 2.0);
        points[2] = new Point2D(3.0, 2.0);
        points[3] = new Point2D(3.0, 1.0);

        Square square = new Square(points);
    }

    @Test(expected = WrongParameterException.class)
    public void test006_squareTest_whenOnOneLine() throws WrongParameterException {
        Point2D[] points = new Point2D[4];

        points[0] = new Point2D(1.0, 1.0);
        points[1] = new Point2D(2.0, 2.0);
        points[2] = new Point2D(3.0, 3.0);
        points[3] = new Point2D(4.0, 4.0);

        Square square = new Square(points);
    }
}

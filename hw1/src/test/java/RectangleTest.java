import figures.AbstractFigure;
import figures.Rectangle;
import org.junit.Assert;
import org.junit.Test;
import utils.WrongParameterException;


public class RectangleTest {
    @Test(expected = NullPointerException.class)
    public void test001_rectangleInitTest_whenNullPoints() throws WrongParameterException {
        AbstractFigure.Point2D[] points = new AbstractFigure.Point2D[4];
        Rectangle rectangle = new Rectangle(points);
    }

    @Test(expected = WrongParameterException.class)
    public void test002_rectangleInitTest_whenWrongPoints() throws WrongParameterException {
        AbstractFigure.Point2D[] points = new AbstractFigure.Point2D[4];

        points[0] = new AbstractFigure.Point2D(1.0, 1.0);
        points[1] = new AbstractFigure.Point2D(1.0, 2.0);
        points[2] = new AbstractFigure.Point2D(3.0, 2.0);
        points[3] = new AbstractFigure.Point2D(3.0, 5.0);

        Rectangle rectangle = new Rectangle(points);
    }

    @Test(expected = WrongParameterException.class)
    public void test003_rectangleInitTest_whenWrongPointsNumber() throws WrongParameterException {
        AbstractFigure.Point2D[] points = new AbstractFigure.Point2D[5];

        points[0] = new AbstractFigure.Point2D(1.0, 1.0);
        points[1] = new AbstractFigure.Point2D(1.0, 2.0);
        points[2] = new AbstractFigure.Point2D(3.0, 2.0);
        points[3] = new AbstractFigure.Point2D(3.0, 5.0);
        points[4] = new AbstractFigure.Point2D(3.0, 5.0);

        Rectangle rectangle = new Rectangle(points);
    }

    @Test
    public void test004_rectangleSquareTest_positive() throws WrongParameterException {
        AbstractFigure.Point2D[] points = new AbstractFigure.Point2D[4];

        points[0] = new AbstractFigure.Point2D(1.0, 1.0);
        points[1] = new AbstractFigure.Point2D(1.0, 2.0);
        points[2] = new AbstractFigure.Point2D(3.0, 2.0);
        points[3] = new AbstractFigure.Point2D(3.0, 1.0);

        Rectangle rectangle = new Rectangle(points);
        Assert.assertEquals(2.0, rectangle.getSquare(), 0.01);
    }

    @Test
    public void test005_rectangleSquareTest_whenSquare() throws WrongParameterException {
        AbstractFigure.Point2D[] points = new AbstractFigure.Point2D[4];

        points[0] = new AbstractFigure.Point2D(1.0, 1.0);
        points[1] = new AbstractFigure.Point2D(1.0, 2.0);
        points[2] = new AbstractFigure.Point2D(2.0, 2.0);
        points[3] = new AbstractFigure.Point2D(2.0, 1.0);

        Rectangle rectangle = new Rectangle(points);

        Assert.assertEquals(1.0, rectangle.getSquare(), 0.01);
    }

    @Test(expected = WrongParameterException.class)
    public void test006_rectangleSquareTest_whenOnOneLine() throws WrongParameterException {
        AbstractFigure.Point2D[] points = new AbstractFigure.Point2D[4];

        points[0] = new AbstractFigure.Point2D(1.0, 1.0);
        points[1] = new AbstractFigure.Point2D(2.0, 2.0);
        points[2] = new AbstractFigure.Point2D(3.0, 3.0);
        points[3] = new AbstractFigure.Point2D(4.0, 4.0);

        Rectangle rectangle = new Rectangle(points);
    }
}

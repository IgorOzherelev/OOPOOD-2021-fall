import figures.AbstractFigure;
import figures.Circle;
import org.junit.Assert;
import org.junit.Test;
import utils.WrongParameterException;


public class CircleTest {

    @Test
    public void test001_circleSquareTest_positive() throws WrongParameterException {
        Circle circle = new Circle(5.0, new AbstractFigure.Point2D(0.0, 0.0));
        Assert.assertEquals(25.0 * Math.PI, circle.getSquare(), 0.01);
    }

    @Test(expected = WrongParameterException.class)
    public void test002_circleSquareTest_negativeRadius() throws WrongParameterException {
        Circle circle = new Circle(-5.0, new AbstractFigure.Point2D(0.0, 0.0));
    }
}

import figures.AbstractFigure;
import figures.Circle;
import org.junit.Assert;
import org.junit.Test;


public class CircleTest {

    @Test
    public void test001_circleSquareTest_positive() {
        Circle circle = new Circle(5.0, new AbstractFigure.Point2D(0.0, 0.0));
        Assert.assertEquals(25.0 * Math.PI, circle.getSquare(), 0.01);
    }
}

package first_homework;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class QuadraticTest {

    @Test
    public void testTwoRealRoots() {
        String result = Quadratic.solveQuadratic(1, -5, 6);
        assertEquals("Корни уравнения: x1 = 3,000000, x2 = 2,000000", result);
    }

    @Test
    public void testOneRealRoot() {
        String result = Quadratic.solveQuadratic(1, 2, 1);
        assertEquals("Уравнение имеет один корень: x = -1,000000", result);
    }

    @Test
    public void testNoRealRoots() {
        String result = Quadratic.solveQuadratic(1, 0, 1);
        assertEquals("нет вещественных корней", result);
    }

    @Test
    public void testNotQuadraticEquation() {
        String result = Quadratic.solveQuadratic(0, 2, 1);
        assertEquals("Это не квадратное уравнение.", result);
    }
}
package second_homework;

import static org.junit.Assert.*;
import org.junit.Test;

public class mainTest {

    // Тесты для Задания 1

    @Test
    public void testTriangle_ValidTriangle() {
        assertTrue(main.triangle(3, 4, 5));
        assertFalse(main.triangle(1, 2, 3));
        assertFalse(main.triangle(-1, 2, 3));
        assertFalse(main.triangle(0, 2, 3));
        assertTrue(main.triangleRecursive(7, 10, 5));
        assertFalse(main.triangleRecursive(1, 2, 3));
        assertFalse(main.triangleRecursive(-1, 2, 3));
    }

    // Тесты для Задания 2

    @Test
    public void testDistance_NormalPoints() {
        double dist = main.distance(0, 0, 3, 4);
        assertEquals(5.0, dist, 1e-6);
    }

    @Test
    public void testDistance_SamePoints() {
        double dist = main.distance(1, 1, 1, 1);
        assertEquals(0.0, dist, 1e-6);
    }

    @Test
    public void testDistance_NegativeCoordinates() {
        double dist = main.distance(-1, -2, -3, -4);
        assertEquals(Math.sqrt(8.0), dist, 1e-6);
    }

    @Test
    public void testDistanceRecursive_NormalPoints() {
        double dist = main.distanceRecursive(0, 0, 3, 4);
        assertEquals(5.0, dist, 1e-6);
    }

    @Test
    public void testDistanceRecursive_SamePoints() {
        double dist = main.distanceRecursive(1, 1, 1, 1);
        assertEquals(0.0, dist, 1e-6);
    }

    @Test
    public void testDistanceRecursive_NegativeCoordinates() {
        double dist = main.distanceRecursive(-1, -2, -3, -4);
        double expected = Math.sqrt(8.0);
        assertEquals(expected, dist, 1e-6);
    }

    // Тесты для Задания 3

    @Test
    public void testPowerLoop_PositiveExponent() {
        double result = main.powerLoop(2, 3);
        assertEquals(8.0, result, 1e-6);
    }

    @Test
    public void testPowerLoop_NegativeExponent() {
        double result = main.powerLoop(2, -3);
        assertEquals(0.125, result, 1e-6);
    }

    @Test
    public void testPowerLoop_ZeroExponent() {
        double result = main.powerLoop(20, 0);
        assertEquals(1.0, result, 1e-6);
    }

    @Test
    public void testPowerLoop_ZeroBase() {
        double result = main.powerLoop(0, 3);
        assertEquals(-1.0, result, 1e-6);
    }

    // Тесты для Задания 4

    @Test
    public void testPower_PositiveExponent() {
        double result = main.power(2, 3);
        assertEquals(8.0, result, 1e-6);
    }

    @Test
    public void testPower() {
        double result = main.power(2, 0);
        double result2 = main.power(0, 3);
        double result3 = main.power(2, -3);
        assertEquals(1.0, result, 1e-6);
        assertEquals(-1.0, result2, 1e-6);
        assertEquals(-1.0, result3, 1e-6);
    }

    // Тесты для Задания 5

    @Test
    public void testTribonacci_BaseCases() { //типо то что я прописал в ифах
        assertEquals(0, main.tribonacci(0));
        assertEquals(0, main.tribonacci(1));
        assertEquals(1, main.tribonacci(2));
    }

    @Test
    public void testTribonacci_OtherCases() {
        assertEquals(1, main.tribonacci(3)); // 0 + 0 + 1
        assertEquals(2, main.tribonacci(4)); // 0 + 1 + 1
        assertEquals(4, main.tribonacci(5)); // 1 + 1 + 2
        assertEquals(7, main.tribonacci(6)); // 1 + 2 + 4
        assertEquals(13, main.tribonacci(7)); // 2 + 4 + 7
        assertEquals(24, main.tribonacci(8)); // 4 + 7 +13
    }

    @Test
    public void testTribonacci_bad() {
        assertEquals(-1, main.tribonacci(-2));
    }
}
package first_homework;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SumTest {

    @Test
    public void SumSum() {
        double sum = Sum.SumSum();
        assertTrue(sum > 0.0);
        assertTrue(sum < 1.0);
    }
}

package first_homework;
//hotya nahui on tyt nyzhen, etot vash test... proveryet, chtobi summa bila v promezhytke ot 0 do 1

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

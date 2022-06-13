import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathSeriesTest {

    @Test
    void fibo() {
        // Test case function
        String actual = MathSeries.fibo(8);
        // compare actual -- expect
        String expect = "0,1,1,2,3,5,8,13";
        assertEquals(actual, expect);
    }

    @Test
    void fibo_base_n() {
        // Test case function
        String actual = MathSeries.fibo(2);
        // compare actual -- expect
        String expect = "0,1";
        assertEquals(actual, expect);
    }
}
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MathSeriesTest {

    @InjectMocks
    MathSeries mathSeries;

    @Mock
    Random random;

    @Test
    void fibo() {
        // Test case function
        // Mock the collaborator object -- Dummy object --- Random
        String actual = mathSeries.fibo(8);
        // compare actual -- expect
        String expect = "0,1,1,2,3,5,8,13";
        assertEquals(actual, expect);
    }

    @Test
    void fibo_base_n() {
        // Test case function
        String actual = mathSeries.fibo(2);
        // compare actual -- expect
        String expect = "0,1";
        assertEquals(actual, expect);
    }

    /* @Test
    void fibo_suprise_me() {
        // Test case function
        // Mock the collaborator object -- Dummy object --- Random
        // if on the dummy object nextInt(????) is called ---- 6
        MathSeries mathSeries = new MathSeries(new Random());
        String actual = mathSeries.fibo(null);
        // compare actual -- expect
        String expect = "0,1,1,2,3,5";
        assertEquals(actual, expect);
    } */
}
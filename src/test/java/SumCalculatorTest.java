import global.goit.edu.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {

    SumCalculator calculator;

    @BeforeEach
    public void beforeEach() {
        calculator = new SumCalculator();
    }

    @Test
    public void testThatMethodSumWithArgument1WorkOk() {
        //Given
        int expected = 1;

        //Then
        Assertions.assertEquals(calculator.sum(1), expected);
    }

    @Test
    public void testThatMethodSumWithArgument3WorkOk() {
        //Given
        int expected = 6;

        //Then
        Assertions.assertEquals(calculator.sum(3), expected);
    }

    @Test
    public void testThatMethodSumWithArgument0WorkOk() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> calculator.sum(0));
    }
}
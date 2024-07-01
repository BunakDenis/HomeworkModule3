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
    public void testThatMethodSumWorkOk() {
        //Given
        int[] digitsForTest = {1, 3, 4, 0};
        int[] expectedDigits = {1, 6, 10, 0};

        //Then
        for (int i = 0; i < digitsForTest.length; i++) {
            int digit = digitsForTest[i];

            if (digitsForTest[i] != 0) {
                Assertions.assertEquals(calculator.sum(digit), expectedDigits[i]);
            } else {
                Assertions.assertThrows(
                        IllegalArgumentException.class,
                        () -> calculator.sum(digit));
            }
        }
    }
}
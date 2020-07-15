package tdd.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {

    @Test
    public void should_return_0_for_empty_string() {
        StringCalculator stringCalculator = new StringCalculator();
        String numbers = "";

        int result = stringCalculator.add(numbers);

        assertThat(result).isEqualTo(0);
    }

    
}

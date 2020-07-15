package tdd.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {

    StringCalculator stringCalculator;

    @BeforeEach
    public void setup() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void should_return_0_for_empty_string() {
        String numbers = "";

        int result = stringCalculator.add(numbers);

        assertThat(result).isEqualTo(0);
    }

//    @ParameterizedTest(name = "test_{index}_should_return_{1}_for_{0}")
    @ParameterizedTest(name = "Should return {1} for {0}")
    @CsvSource(value = {"10:10", "10,20:30", "10,20,10:40", "1\\n2,3:6"}, delimiter = ':')
    void should_return_sum_of_numbers_for_given_input_numbers(String numbers, int expected) {
        int result = stringCalculator.add(numbers);

        assertThat(result).isEqualTo(expected);
    }
}

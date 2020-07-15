package tdd.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

    @Test
    void should_return_number_for_number() {
        String numbers = "10";

        int result = stringCalculator.add(numbers);

        assertThat(result).isEqualTo(10);
    }

    @Test
    void should_return_sum_of_numbers_for_2_input_numbers() {
        String numbers = "10,20";

        int result = stringCalculator.add(numbers);

        assertThat(result).isEqualTo(30);
    }

}

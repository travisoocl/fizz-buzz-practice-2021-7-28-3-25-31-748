package tdd.fizzbuzz;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_print_number_when_assess_number_given_1(){

    String expected = String.valueOf(1);
    String actual = FizzBuzz.assess(1);

    assertEquals(expected,actual );
    }
}

package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_print_number_when_assess_number_given_1() {

        String expected = String.valueOf(1);
        String actual = FizzBuzz.assess(1);

        assertEquals(expected, actual);
    }

    @Test
    public void should_print_fizz_when_assess_number_given_3() {

        String expected = "Fizz";
        String actual = FizzBuzz.assess(3);

        assertEquals(expected, actual);
    }

    @Test
    public void should_print_buzz_when_assess_number_given_5() {

        String expected = "Buzz";
        String actual = FizzBuzz.assess(5);

        assertEquals(expected, actual);
    }

    @Test
    public void should_print_whizz_when_assess_number_given_7() {

        String expected = "Whizz";
        String actual = FizzBuzz.assess(5);

        assertEquals(expected, actual);
    }


}

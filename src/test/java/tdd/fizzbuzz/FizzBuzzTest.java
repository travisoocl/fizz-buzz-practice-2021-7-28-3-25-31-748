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
        String actual = FizzBuzz.assess(7);

        assertEquals(expected, actual);
    }

    @Test
    public void should_print_FizzBuzz_when_assess_number_given_15() {

        String expected = "FizzBuzz";
        String actual = FizzBuzz.assess(15);

        assertEquals(expected, actual);
    }

    @Test
    public void should_print_FizzWhizz_when_assess_number_given_21() {

        String expected = "FizzWhizz";
        String actual = FizzBuzz.assess(21);

        assertEquals(expected, actual);
    }

    @Test
    public void should_print_BuzzWhizz_when_assess_number_given_35() {

        String expected = "BuzzWhizz";
        String actual = FizzBuzz.assess(35);

        assertEquals(expected, actual);
    }


    @Test
    public void should_print_FizzBuzzWhizz_when_assess_number_given_105() {

        String expected = "FizzBuzzWhizz";
        String actual = FizzBuzz.assess(105);

        assertEquals(expected, actual);
    }

}

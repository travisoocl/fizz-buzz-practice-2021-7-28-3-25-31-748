package tdd.fizzbuzz;

public class FizzBuzz {
    public static String assess(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }

        if (number % 7 == 0)
        {
            return  "Whizz";
        }
            return String.valueOf(number);
    }
}

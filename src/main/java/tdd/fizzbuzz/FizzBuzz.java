package tdd.fizzbuzz;

public class FizzBuzz {
    public static String assess(int number) {
        if(number%3==0)
        {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}

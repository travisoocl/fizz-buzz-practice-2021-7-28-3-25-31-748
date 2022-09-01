package tdd.fizzbuzz;

public class FizzBuzz {
    public static String assess(int number) {
        StringBuilder message = new StringBuilder();
        if (number % 3 == 0) {
            message.append("Fizz");
        }
        if (number % 5 == 0) {
            message.append("Buzz");
        }

        if (number % 7 == 0)
        {
            message.append("Whizz");
        }
        if(message.length() == 0)
        {
            message.append(number);
        }
        return message.toString();
    }
}

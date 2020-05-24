package com.qilinlou.fizzbuzz;

public class FizzBuzz {
    public String reporting(int input) {
        if (input % 3 == 0 && input % 5 == 0)
            return "FizzBuzz";
        if (input % 7 == 0) return "Whizz";
        if (input % 5 == 0) return "Buzz";
        if (input % 3 == 0) return "Fizz";
        return String.valueOf(input);
    }
}

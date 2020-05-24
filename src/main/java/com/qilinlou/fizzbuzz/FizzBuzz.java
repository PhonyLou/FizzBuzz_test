package com.qilinlou.fizzbuzz;

public class FizzBuzz {
    public String reporting(int input) {
        if (input % 3 == 0) return "Fizz";
        return String.valueOf(input);
    }
}

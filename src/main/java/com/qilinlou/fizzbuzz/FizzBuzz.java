package com.qilinlou.fizzbuzz;

public class FizzBuzz {
    public String reporting(int input) {
        boolean isMod5 = input % 5 == 0;
        boolean isMod3 = input % 3 == 0;

        if (isMod3 && isMod5)
            return "FizzBuzz";
        if (input % 7 == 0) return "Whizz";
        if (isMod3) return "Fizz";
        if (isMod5) return "Buzz";
        return String.valueOf(input);
    }
}

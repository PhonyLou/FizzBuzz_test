package com.qilinlou.fizzbuzz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    void should_return_normal_number_when_reporting_given_normal_number() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expect = "2";
        Assert.assertEquals(expect, fizzBuzz.reporting(2));
    }

    @Test
    void should_return_Fizz_when_reporting_given_number_is_mod_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expect = "Fizz";
        Assert.assertEquals(expect, fizzBuzz.reporting(6));
    }

    @Test
    void should_return_Buzz_when_reporting_given_number_is_mod_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expect = "Buzz";
        Assert.assertEquals(expect, fizzBuzz.reporting(10));
    }

    @Test
    void should_return_Whizz_when_reporting_given_number_is_mod_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expect = "Whizz";
        Assert.assertEquals(expect, fizzBuzz.reporting(14));
    }

    @Test
    void should_return_FizzBuzz_when_reporting_given_number_is_mod_3_and_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expect = "FizzBuzz";
        Assert.assertEquals(expect, fizzBuzz.reporting(15));
    }

    @Test
    void should_return_FizzWhizz_when_reporting_given_number_is_mod_3_and_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expect = "FizzWhizz";
        Assert.assertEquals(expect, fizzBuzz.reporting(21));
    }

    @Test
    void should_return_BuzzWhizz_when_reporting_given_number_is_mod_5_and_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expect = "BuzzWhizz";
        Assert.assertEquals(expect, fizzBuzz.reporting(35));
    }

    @Test
    void should_return_FizzBuzzWhizz_when_reporting_given_number_is_mod_3_5_and_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expect = "FizzBuzzWhizz";
        Assert.assertEquals(expect, fizzBuzz.reporting(105));
    }
}

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
}

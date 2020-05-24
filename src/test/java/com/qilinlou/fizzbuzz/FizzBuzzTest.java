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
}

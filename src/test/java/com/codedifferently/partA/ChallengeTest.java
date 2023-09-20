package com.codedifferently.partA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChallengeTest {

    @Test
    public void testOne(){
        Challenge algoProblem13 = new Challenge();

        String expected = "(123) 456-7890";
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String actual = algoProblem13.formatPhoneNumber(input);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testTwo(){
        Challenge challenge = new Challenge();

        String expected = "(519) 555-4468";
        int[] input = {5, 1, 9, 5, 5, 5, 4, 4, 6, 8};
        String actual = challenge.formatPhoneNumber(input);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testThree(){
        Challenge algoProblem13 = new Challenge();

        String expected = "(345) 501-2527";
        int[] input = {3, 4, 5, 5, 0, 1, 2, 5, 2, 7};
        String actual = algoProblem13.formatPhoneNumber(input);

        Assertions.assertEquals(expected,actual);
    }



}

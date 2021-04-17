package com.belloot.tech;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppSumIntegers_Test
{
    /**
     * Rigorous Test :-)
     */
    /*@Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }*/

    @Test
    public void SumOf_2_Numbers_ShouldBeAccurate(){
        Integer nb1 = 10, nb2 = 10;
        assertEquals( Sum(nb1, nb2), 20 );
    }

    @Test
    public void SumOf_2_PositiveIntegers_ShouldBePositive(){
        Integer nb1 = 10, nb2 = 0 ;
        assertEquals( Sum(nb1, nb2), 20 );
    }

    @Test
    public void SumOf_2_NegativeIntegers_ShouldBeNegative(){
        Integer nb1 = -10, nb2 = -20;
        assertEquals( Sum(nb1, nb2), -30 );
    }

    @Test
    public void SumOf_HigherPositiveWithLowerNegativeIntegers_ShouldBePositive(){
        Integer nb1 = 10, nb2=-5;
        assertEquals( Sum(nb1, nb2), 5 );
    }

    @Test
    public void SumOf_LowerPositiveWithHigherNegativeIntegers_ShouldBeNegative(){
        Integer nb1 = 10, nb2 = -40;
        assertEquals( Sum(nb1, nb2), -30 );
    }

    @Test
    public void SumOf_LowerPositiveWithHigherNegativeIntegers_ShouldBeNegative(){
        Integer nb1 = 10, nb2 = -40;
        assertEquals( Sum(nb1, nb2), -30 );
    }

    @Test
    public void SumOf_ZeroWithAnyPositiveIntegers_ShouldReturnThePositiveInteger(){
        Integer nb1 = 0, nb2 = 30;
        assertEquals( Sum(nb1, nb2), 30 );
    }

    @Test
    public void SumOf_ZeroWithAnyNegativeIntegers_ShouldReturnTheIntegerInteger(){
        Integer nb1 = 0, nb2 = -30;
        assertEquals( Sum(nb1, nb2), -30 );
    }

    @Test
    public void SumOf_ZeroWithZero_ShouldReturnZero(){
        Integer nb1 = 0, nb2 = -30;
        assertEquals( Sum(nb1, nb2), -30 );
    }

    @Test
    public void SumOf_AListOfIntegers_ShouldReturnAccurateInteger(){
        List<Integer> l = Arrays.asList(1, 111, -3, 4, -2);
        assertEquals( Sum(l), 101 );
    }
}

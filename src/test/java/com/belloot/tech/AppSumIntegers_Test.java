package com.belloot.tech;

import static org.junit.Assert.*;
import Model.Sum;
import org.junit.Test;

import java.util.ArrayList;
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

    Sum sum = new Sum();

    @Test
    public void SumOf_2_Numbers_ShouldBeAccurate(){
        Integer nb1 = 10, nb2 = 10;
        assertEquals( (long)sum.perform(10, 10), 20);
    }

    @Test
    public void SumOf_2_PositiveIntegers_ShouldBePositive(){
        Integer nb1 = 10, nb2 = 01 ;
        assertEquals( (long)sum.perform(nb1, nb2), 11);
    }

    @Test
    public void SumOf_2_NegativeIntegers_ShouldBeNegative(){
        Integer nb1 = -10, nb2 = -20;
        assertEquals( (long)sum.perform(nb1, nb2), -30);
    }

    @Test
    public void SumOf_HigherPositiveWithLowerNegativeIntegers_ShouldBePositive(){
        Integer nb1 = 10, nb2=-5;
        assertEquals( (long)sum.perform(nb1, nb2), 5);
    }

    @Test
    public void SumOf_LowerPositiveWithHigherNegativeIntegers_ShouldBeNegative(){
        Integer nb1 = 10, nb2 = -40;
        assertEquals( (long)sum.perform(nb1, nb2), -30);
    }

    @Test
    public void SumOf_ZeroWithAnyPositiveIntegers_ShouldReturnThePositiveInteger(){
        Integer nb1 = 0, nb2 = 30;
        assertEquals( (long)sum.perform(nb1, nb2), 30);
    }

    @Test
    public void SumOf_ZeroWithAnyNegativeIntegers_ShouldReturnTheIntegerInteger(){
        Integer nb1 = 0, nb2 = -30;
        assertEquals( (long)sum.perform(nb1, nb2), -30);
    }

    @Test
    public void SumOf_ZeroWithZero_ShouldReturnZero(){
        Integer nb1 = 0, nb2 = -30;
        assertEquals( (long)sum.perform(nb1, nb2), -30);
    }

//    @Test
//    public void SumOf_AListOfIntegers_ShouldReturnAccurateInteger(){
//        List<Integer> l = new ArrayList<Integer>() {{ add(1);  add(111);  add(-3);  add(4);  add(-2); }};
//        assertEquals( (long)sum.perform(l), 101);
//    }
}

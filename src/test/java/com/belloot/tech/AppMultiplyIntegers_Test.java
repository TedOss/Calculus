package com.belloot.tech;

import org.junit.Test;

import static org.junit.Assert.*;
import Model.Multiply;

public class AppMultiplyIntegers_Test {

    /**
     * Unit test for simple App.
     */
        Multiply multip = new Multiply();

    @Test
    public void Multiplying_2_Numbers_ShouldBeAccurate(){
        Integer nb1 = 10, nb2 = 10;
        assertEquals( (long)multip.perform(10, 10), 100);
    }

    @Test
    public void Multiplying_2_PositiveIntegers_ShouldBePositiveResult(){
        Integer nb1 = 10, nb2 = 1 ;
        assertEquals( (long)multip.perform(nb1, nb2), 10);
    }

    @Test
    public void Multiplying_2_NegativeIntegers_ShouldBePositiveResult(){
        Integer nb1 = -5, nb2 = -5 ;
<<<<<<< HEAD
        assertEquals( (long)multip.perform(nb1, nb2), 25);
=======
        assertEquals( (long)multip.perform(nb1, nb2), -25);
>>>>>>> a4d6ed7895e25f733d82b6f0a6a90e8fd313f418
    }

    @Test
    public void Multiplying_1_NegativeInteger_with_1_PositiveInteger_ShouldBeNegativeResult(){
        Integer nb1 = -5, nb2 = 3 ;
        assertEquals( (long)multip.perform(nb1, nb2), -15);
    }
}

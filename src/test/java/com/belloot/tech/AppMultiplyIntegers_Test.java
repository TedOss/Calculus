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
}

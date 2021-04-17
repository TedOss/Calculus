package com.belloot.tech;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppSum_Test
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
    public void Sum_2Number_ShouldBeAccurate(){
        int nb1 = 10, nb2 = 10;
        assertEquals( Sum(nb1, nb2), 20 );
    }
}

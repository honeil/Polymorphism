package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hilaryoneil on 1/31/17.
 */
public class DinoTest {

    @Test
    public void nameTest_ShouldReturnDinoName(){
        Dino tRex = new Dino("T-Rex");
        String expected = "T-Rex";
        String actual= tRex.getPetName();
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void speakTest_ShouldReturnDinoSound(){
        Dino tRex = new Dino("T-Rex");
        String expected = "RAWRRRRRRR!!!!";
        String actual = tRex.speak();
        Assert.assertEquals(actual, expected);
    }
}

package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hilaryoneil on 1/31/17.
 */
public class CatTest {



    @Test
    public void nameTest_ShouldReturnCatName(){
        Cat test = new Cat("Jerry");
        String expected = "Jerry";
        String actual = test.getPetName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void speakTest_ShouldReturnCatSound(){
        Cat test = new Cat("Jerry");
        String expected = "meow meow!";
        String actual = test.speak();
        Assert.assertEquals(actual, expected);
    }


}

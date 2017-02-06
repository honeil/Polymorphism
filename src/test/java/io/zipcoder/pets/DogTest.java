package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hilaryoneil on 1/31/17.
 */
public class DogTest {

    @Test
    public void nameTest_ShouldReturnDogName() {
        Dog sparky = new Dog("Sparky");
        String expected = "Sparky";
        String actual = sparky.getPetName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void speakTest_ShouldReturnDogSound(){
        Dog sparky = new Dog("Sparky");
        String expected = "woof woof!";
        String actual = sparky.speak();
        Assert.assertEquals(expected, actual);
    }
}

package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hilaryoneil on 1/31/17.
 */
public class PetGeneratorTest {

    @Test
    public void petGeneratorNameTest_ShouldReturnPetName() {
        PetGenerator pg = new PetGenerator();
        Pet spot = pg.createPet("Spot", "Dog");
        String expected = "Spot";
        String actual = spot.getPetName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petGeneratorDogTest_ShouldReturnDogNoise(){
        PetGenerator pg = new PetGenerator();
        Pet brownie = pg.createPet("Brownie", "Dog");
        String expected = "woof woof!";
        String actual = brownie.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petGeneratorCatTest_ShouldReturnCatNoise(){
        PetGenerator pg = new PetGenerator();
        Pet whiskers = pg.createPet("Whiskers", "Cat");
        String expected = "meow meow!";
        String actual = whiskers.speak();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void petGeneratorDinoTest_ShouldReturnDinoNoise(){
        PetGenerator pg = new PetGenerator();
        Pet frank = pg.createPet("Frank", "Dino");
        String expected = "RAWRRRRRRR!!!!";
        String actual = frank.speak();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void petGeneratorPetTest_ShouldReturnPetNoise(){
        PetGenerator pg = new PetGenerator();
        Pet lizzy = pg.createPet("Lizzy", "Pet");
        String expected = "grrrrrrr!";
        String actual = lizzy.speak();
        Assert.assertEquals(expected,actual);
    }



}

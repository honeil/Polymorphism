package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hilaryoneil on 1/31/17.
 */
public class PetDataWarehouseTest {

    @Test
    public void addPetToListTestByName_ShouldReturnDogNameAtIndexZero(){
        PetDataWarehouse pdw = new PetDataWarehouse();
        pdw.addPetToList("Jake", "Dog");
        pdw.addPetToList("Red", "Cat");
        String expected = "Red";
        String actual = pdw.getPetByIndex(1).getPetName();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void addPetToListTestByType_ShouldReturnDogSoundAtIndexZero(){
        PetDataWarehouse pdw = new PetDataWarehouse();
        pdw.addPetToList("Jake", "Dog");
        String expected = "woof woof!";
        String actual = pdw.getPetByIndex(0).speak();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addPetToListTestCat_ShouldReturnCatSoundAtIndexZero(){
        PetDataWarehouse pdw = new PetDataWarehouse();
        pdw.addPetToList("Red", "Cat");
        String expected = "meow meow!";
        String actual = pdw.getPetByIndex(0).speak();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addPetToListTestDino_ShouldReturnDinoSoundAtIndexZero(){
        PetDataWarehouse pdw = new PetDataWarehouse();
        pdw.addPetToList("T-Rex", "Dino");
        String expected = "RAWRRRRRRR!!!!";
        String actual = pdw.getPetByIndex(0).speak();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addPetToListTestPet_ShouldReturnPetSoundAtIndexZero(){
        PetDataWarehouse pdw = new PetDataWarehouse();
        pdw.addPetToList("Tropicana", "Pet");
        String expected = "grrrrrrr!";
        String actual = pdw.getPetByIndex(0).speak();
        Assert.assertEquals(expected,actual);
    }


}

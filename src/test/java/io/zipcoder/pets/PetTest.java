package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hilaryoneil on 1/31/17.
 */
public class PetTest {

    @Test
    public void nameTest_ShouldReturnPetName(){
        Pet pet= new Pet("Spot");
        String expected ="Spot";
        String actual = pet.getPetName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest_PetReturnsAnimalNoise_ShouldReturnGrrrr(){
        Pet pet = new Pet("Oreo");
        String expected = "grrrrrrr!";
        String actual = pet.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void compareTo_InputIsAlphabeticallyLower_ShouldReturnPositiveValue() {
        //Arrange
        Pet pet1 = new Dog("Letty");
        Pet pet2 = new Cat("Bubba");
        //Assert
        int actualValue = pet1.compareTo(pet2);
        boolean valueIsPositive = actualValue > 0;
        //Act
        Assert.assertTrue(valueIsPositive);
    }

    @Test
    public void compareTo_InputIsAlphabeticallyHigher_ShouldReturnNegativeValue(){
        //Arrange
        Pet pet1 = new Dog("Letty");
        Pet pet2 = new Cat("Bubba");
        //Assert
        int actualValue = pet2.compareTo(pet1);
        boolean valueIsNegative = actualValue < 0;
        //Act
        Assert.assertTrue(valueIsNegative);
    }

    @Test
    public void compareTo_InputIsAlphabeticallyEqualAndTypesAreSame_ShouldReturnValueOfZero(){
        //Arrange
        Pet pet1 = new Dog("Letty");
        Pet pet2 = new Dog("Letty");
        //Assert
        int actualValue = pet1.compareTo(pet2);
        int expectedValue = 0;
        //Act
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void compareTo_InputIsAlphabeticallyEqualArrangeByType_ShouldReturnPositiveValue(){
        //Arrange
        Pet pet1 = new Dog("Letty");
        Pet pet2 = new Cat("Letty");
        //Assert
        int actualValue = pet1.compareTo(pet2);
        boolean valueIsPositive = actualValue > 0;
        //Act
        Assert.assertTrue(valueIsPositive);
    }

    @Test
    public void compareTo_InputIsAlphabeticallyEqualArrangeByType_ShouldReturnNegativeValue(){
        //Arrange
        Pet pet1 = new Dog("Letty");
        Pet pet2 = new Dino("Letty");
        //Assert
        int actualValue = pet2.compareTo(pet1);
        boolean valueIsNegative = actualValue < 0;
        //Act
        Assert.assertTrue(valueIsNegative);
    }

}

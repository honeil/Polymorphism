package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hilaryoneil on 2/1/17.
 */
public class PetComparatorTest {

    @Test
    public void compareTest_TypesAreDifferentButNamesAreTheSame_ShouldReturnNegativeValue(){
        PetComparator pgTest = new PetComparator();
        Pet pet1 = new Cat("aaa");
        Pet pet2 = new Dino("aaa");
        int actualValue = pgTest.compare(pet1,pet2);
        boolean valueIsNegative = actualValue < 0;
        Assert.assertTrue(valueIsNegative);
    }

    @Test
    public void compareTest_TypesAreDifferentButNamesAreTheSame_ShouldReturnPositiveValue(){
        PetComparator pgTest = new PetComparator();
        Pet pet1 = new Cat("aaa");
        Pet pet2 = new Dino("aaa");
        int actualValue = pgTest.compare(pet2,pet1);
        boolean valueIsPositive = actualValue > 0;
        Assert.assertTrue(valueIsPositive);
    }

    @Test
    public void compareTest_TypesAreTheSameInputIsLexicographicallyLess_ShouldReturnPositiveValue(){
        PetComparator pgTest = new PetComparator();
        Pet pet1 = new Dino("aab");
        Pet pet2 = new Dino("aaa");
        int actualValue = pgTest.compare(pet1,pet2);
        boolean valueIsPositive = actualValue >0;
        Assert.assertTrue(valueIsPositive);
    }

    @Test
    public void compareTest_TypesAreTheSameInputIsLexicographicallyHigher_ShouldReturnNegativeValue(){
        PetComparator pgTest = new PetComparator();
        Pet pet1 = new Dino("aaa");
        Pet pet2 = new Dino("aab");
        int actualValue = pgTest.compare(pet1,pet2);
        boolean valueIsNegative = actualValue < 0;
        Assert.assertTrue(valueIsNegative);
    }

    @Test
    public void compareTest_TypesAndNamesAreTheSame_ShouldReturnZeroValue(){
        PetComparator pgTest = new PetComparator();
        Pet pet1 = new Cat("aaa");
        Pet pet2 = new Cat("aaa");
        int expectedValue = 0;
        int actualValue = pgTest.compare(pet1,pet2);
        Assert.assertEquals(expectedValue, actualValue);
    }

}

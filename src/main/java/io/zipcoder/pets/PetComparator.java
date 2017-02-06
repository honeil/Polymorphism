package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by hilaryoneil on 2/1/17.
 */
public class PetComparator implements Comparator<Pet> {

    Pet pet;

    PetComparator(){
        pet = new Pet();
    }

    public int compare(Pet pet1, Pet pet2){

        int value= pet1.getType().compareTo(pet2.getType());
        if(value ==0){
            value= pet1.getPetName().compareTo(pet2.getPetName());
        }
        return value;
    }

    public ArrayList<Pet> sortListByName(ArrayList<Pet> pets){
        return null;
    }

    public ArrayList<Pet> sortListByType(ArrayList<Pet> pets){
        return null;
    }

}

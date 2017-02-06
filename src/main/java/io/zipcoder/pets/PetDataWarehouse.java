package io.zipcoder.pets;

import java.util.ArrayList;

/**
 * Created by hilaryoneil on 1/31/17.
 */
public class PetDataWarehouse {
  static ArrayList<Pet> petsList =  new ArrayList<>();
  PetGenerator petGenerator;

  PetDataWarehouse(){
      petGenerator= new PetGenerator();
  }

  public void addPetToList(String name, String type){
       petsList.add(petGenerator.createPet(name,type));
  }

  public Pet getPetByIndex(int index){
      return petsList.get(index);
  }

}

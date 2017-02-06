package io.zipcoder.pets;

/**
 * Created by hilaryoneil on 1/31/17.
 */
public class Pet implements Comparable<Pet> {

    private String name;

    public Pet(){}

    public Pet(String name){
        this.name = name;
    }

    public String getPetName() {
        return name;
    }

    public String getType() {
        return "Pet";
    }

    public String speak(){
        return "grrrrrrr!";
    }

   @Override
    public int compareTo(Pet pet) {
       int value = this.name.compareTo(pet.getPetName());
       if (value == 0) {
           value = this.getType().compareTo(pet.getType());
       }
       return value;
   }
}



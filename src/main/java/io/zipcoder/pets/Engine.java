package io.zipcoder.pets;


import java.util.Collections;

import static io.zipcoder.pets.PetDataWarehouse.petsList;

/**
 * Created by hilaryoneil on 1/31/17.
 */
public class Engine {
    private PetDataWarehouse pdw;
    private InputOutput io;
    private PetComparator petComparator;
    Engine(){
        pdw = new PetDataWarehouse();
        io = new InputOutput();
        petComparator = new PetComparator();
    }


    public void run(){
        int numOfPets = io.promptUserForNumberOfPets();
        for(int i =0; i< numOfPets; i++) {
            pdw.addPetToList(io.promptUserForNameOfPet(), io.promptUserForTypeOfPet());
        }
        Collections.sort(petsList);
        io.printMessageAboutSorting("Sort by name, ties broken by class type");
        io.printListOfPets(petsList);

        Collections.sort(petsList, petComparator);
        io.printMessageAboutSorting("Sort pet objects by type, ties broken by name");
        io.printListOfPets(petsList);

    }





}

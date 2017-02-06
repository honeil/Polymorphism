package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by hilaryoneil on 1/31/17.
 */
public class InputOutput {
    Scanner scanner = new Scanner(System.in);
    Pet pet= new Pet();

    public int promptUserForNumberOfPets(){
        System.out.println("How many pets do you have? ");
        return scanner.nextInt();
    }

    public String promptUserForNameOfPet() {
        System.out.println("What is the name of your pet? ");
        return scanner.next();
    }

    public String promptUserForTypeOfPet(){
        System.out.println("What type of pet is it? ");
        return scanner.next();
    }

    public void printMessageAboutSorting(String message){
        System.out.println(message);
    }

    public void printListOfPets(ArrayList<Pet> list){
        for(Pet pet: list){
            System.out.println(pet.getPetName() + " says " + pet.speak());
        }
        System.out.println();
    }
}

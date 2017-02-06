package io.zipcoder.pets;

/**
 * Created by hilaryoneil on 1/31/17.
 */
public class Dino extends Pet{

    Dino(String name){
        super(name);
    }

    public String getType() {
        return "Dino";
    }

    @Override
    public String speak(){
        return "RAWRRRRRRR!!!!";
    }


}

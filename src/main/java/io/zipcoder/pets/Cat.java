package io.zipcoder.pets;

/**
 * Created by hilaryoneil on 1/31/17.
 */
public class Cat extends Pet {

    Cat(String name){
        super(name);
    }

    public String getType() {
        return "Cat";
    }

    @Override
    public String speak(){
        return "meow meow!";
    }

}

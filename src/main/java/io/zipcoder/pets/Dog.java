package io.zipcoder.pets;

/**
 * Created by hilaryoneil on 1/31/17.
 */
public class Dog extends Pet{

    Dog(String name){
        super(name);
    }

    public String getType() {
        return "Dog";
    }

    @Override
    public String speak(){
        return "woof woof!";
    }


}

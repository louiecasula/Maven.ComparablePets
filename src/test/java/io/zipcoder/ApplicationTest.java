package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class ApplicationTest {
    Pet dog = new Dog("Xander");
    Pet cat = new Cat("Charles");
    Pet lizard = new Lizard("Adam");
    ArrayList<Pet> pets = new ArrayList<>();

    @Test
    public void testSortWithSameTypes(){
        pets.add(dog);
        pets.add(cat);
        pets.add(lizard);
        Collections.sort(pets);
        Assert.assertEquals("[Este lagarto se llama Adam, Este gatto se llama Charles, Este perro se llama Xander]"
                ,pets.toString());
    }

    @Test
    public void testSortWithSameNames(){
        dog.name = "Sam";
        pets.add(dog);
        cat.name = "Sam";
        pets.add(cat);
        lizard.name = "Sam";
        pets.add(lizard);
        PetTypeComparator petComp = new PetTypeComparator();
        pets.sort(petComp);
        Assert.assertEquals("[Este gatto se llama Sam, Este perro se llama Sam, Este lagarto se llama Sam]"
                ,pets.toString());
    }
}

package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class ApplicationTest {
    Pet dog = new Pet("Xander");
    Pet cat = new Pet("Charles");
    Pet lizard = new Pet("Adam");
    ArrayList<Pet> pets = new ArrayList<>();

    @Test
    public void testSort(){
        pets.add(dog);
        pets.add(cat);
        pets.add(lizard);
        Collections.sort(pets);
        Assert.assertEquals("[Esta mascota se llama Adam, Esta mascota se llama Charles, Esta mascota se llama Xander]"
                ,pets.toString());
    }
}

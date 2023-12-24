package io.zipcoder;

import java.util.Comparator;

public class PetTypeComparator implements Comparator<Pet> {

    @Override
    public int compare(Pet firstPet, Pet secondPet) {
        return firstPet.getClass().toString().compareTo(secondPet.getClass().toString());
    }
}

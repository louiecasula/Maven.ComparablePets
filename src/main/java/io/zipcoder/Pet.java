package io.zipcoder;

public class Pet implements Comparable<Pet>{
    String name;
    public Pet(){
        this.name = "The Pet With No Name";
    }

    public Pet(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String speak(){
        return "Ayo what's good? I'm a mf animal of some kind.";
    }

    @Override
    public String toString() {
        return "Esta mascota se llama " + name;
    }

    @Override
    public int compareTo(Pet otherPet) {
        return getName().compareTo(otherPet.getName());
    }
}

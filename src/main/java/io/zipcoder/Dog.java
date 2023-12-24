package io.zipcoder;

public class Dog extends Pet{
    public Dog(){
        super();
    }
    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak(){
        return "Woof! Bark! Reeheehee!";
    }

    @Override
    public String toString() {
        return "Este perro se llama " + name;
    }
}

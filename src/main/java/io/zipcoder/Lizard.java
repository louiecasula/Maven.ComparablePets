package io.zipcoder;

public class Lizard extends Pet{
    public Lizard(){
        super();
    }
    public Lizard(String name) {
        super(name);
    }
    @Override
    public String speak(){
        return "*Lizard tongue sounds* Note to self: Don't drink tap water at Jerry Garcia's house.";
    }

    @Override
    public String toString() {
        return "Este lagarto se llama " + name;
    }
}

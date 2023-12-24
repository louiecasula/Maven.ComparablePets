package io.zipcoder;

public class Cat extends Pet{
    public Cat(){
        super();
    }
    public Cat(String name) {
        super(name);
    }
    @Override
    public String speak(){
        return "Mow! Purrr... I hate Mondays.";
    }

    @Override
    public String toString() {
        return "Este gatto se llama " + name;
    }
}

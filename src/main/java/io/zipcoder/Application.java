package io.zipcoder;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Application {
    static Scanner scan = new Scanner(System.in);
    static LinkedHashMap<String, String> mascotas = new LinkedHashMap<>();
    public static void main (String... args){
        System.out.print("Hola! Cuantas mascotas tienes? ");
        int cuantidad = scan.nextInt();
        scan.nextLine();
        for (int i = 1; i <= cuantidad; i++){
            System.out.printf("Como se llama mascota #%d? ", i);
            String animalCurrente = scan.nextLine();
            mascotas.put(animalCurrente, "");
            System.out.print("Que tipo de animal es? ");
            mascotas.put(animalCurrente, scan.nextLine());
        }
        // Iterate through keys, instantiate each pet.
        ArrayList<Pet> pets = new ArrayList<>();
        for (String k: mascotas.keySet()){
            if (mascotas.get(k).equals("Dog")){
                pets.add(new Dog(k));
            }
            else if (mascotas.get(k).equals("Cat")){
                pets.add(new Cat(k));
            }
            else if (mascotas.get(k).equals("Lizard")){
                pets.add(new Lizard(k));
            }
            else {
                pets.add(new Pet(k));
            }
        }
        // Print each one's name and what it says.
        for (Pet current : pets) {
            System.out.println(current.toString() + " y dice " + current.speak());
        }
    }
}

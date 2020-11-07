package com.programmerfox.demo.model;

import java.util.ArrayList;

public class FoxesList {
    public ArrayList<Fox> foxes;

    public FoxesList(ArrayList<Fox> foxes) {
        this.foxes = foxes;
    }

    public FoxesList() {
        this.foxes = new ArrayList<Fox>();
        foxes.add(new Fox("Vuk", "Water", "Pizza"));
        foxes.add(new Fox("Alajos", "Water", "Pizza"));
        foxes.add(new Fox("Bela", "Water", "Pizza"));
    }

    public ArrayList<Fox> addFox(Fox fox) {
        foxes.add(fox);
        return foxes;
    }

    public Fox checkFoxes(String name) {
        for (int i = 0; i < foxes.size(); i++) {
            ;
            if (foxes.get(i).getName().equals(name)) {
                return foxes.get(i);
            } else {
                return null;
            }
        }
        return null;
    }
}

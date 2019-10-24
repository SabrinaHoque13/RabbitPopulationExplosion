package com.spartaglobal.RabbitPopulationExplosion;

import java.util.ArrayList;
import java.util.List;

public class MakeRabbit {
    int noOfChildren;

    public int giveBirth() {
        noOfChildren = ((int) (Math.random() * ((14 - 1))) + 1);

        return noOfChildren;
    }

    public Rabbit makeRabbit(int year, int age, boolean pregnant, boolean mature, boolean alive) {
        FemaleRabbit newFemale = new FemaleRabbit();
        newFemale.setMature(mature);
        newFemale.setPregnant(pregnant);
        newFemale.setAlive(alive);
        newFemale.setYearOfBirth(year);
        newFemale.setAge(age);

        return newFemale;
    }

    List<IRabbit> TotalRabbit = new ArrayList<>();
    List<IRabbit> TotalFemaleRabbit = new ArrayList<>();
    List<IRabbit> TotalMaleRabbit = new ArrayList<>();

    public void Birth() {
        int numOfNew = 10;
        for (int i = 0; i < numOfNew; i++) {
            giveBirth();
            addToArray(2,1,true,true,true);

        }
    }
    public void addToArray(int year, int age, boolean pregnant, boolean mature, boolean alive){
        for (int i = 0; i < noOfChildren; i++) {
            TotalRabbit.add(makeRabbit(year, age, pregnant, mature, alive));
        }
        System.out.println("Total number of rabbits" + TotalRabbit.size());
    }
}

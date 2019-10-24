package com.spartaglobal.RabbitPopulationExplosion;

import java.util.ArrayList;
import java.util.List;

public class World {
    private int month;

    List<IRabbit> femaleRabbits = new ArrayList<>();
    List<IRabbit> maleRabbits = new ArrayList<>();
    private int noOfNewMale;
    private int noOfNewFemale;
    private int totalNewRabbit;


    public void startWorld() {
        AddRabbits addRabbits = new AddRabbits();
        LifeSpanLength lifeSpanLength = new LifeSpanLength();
        MakeRabbit makeFemaleRabbit = new MakeRabbit();
        int length = lifeSpanLength.setLength();
        month = 0;
        while (month < length) {
            femaleRabbits = addRabbits.addRabbitList(1, 1);

            System.out.println("Number of females in world:" + noOfNewFemale);
            month++;
        }

    }
}
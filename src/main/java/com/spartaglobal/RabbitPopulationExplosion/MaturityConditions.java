package com.spartaglobal.RabbitPopulationExplosion;

import java.util.List;

public class MaturityConditions {

    public List<IRabbit> CanBreed(List<IRabbit> rabbits) {
        for (int i = 0; i < rabbits.size(); i++) {
            if (rabbits.get(i).getAge() >= 3) {

            }
            rabbits.get(i).setMature(true);

        }
        return rabbits;
    }
}
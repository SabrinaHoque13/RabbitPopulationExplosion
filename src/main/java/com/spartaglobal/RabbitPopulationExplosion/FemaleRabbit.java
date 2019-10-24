package com.spartaglobal.RabbitPopulationExplosion;

public class FemaleRabbit extends Rabbit implements IFemaleRabbit {
    private boolean pregnant;
    int noOfChildren;

    public void setPregnant(boolean pregnant) {
        this.pregnant = pregnant;
    }

    @Override
    public boolean getPregnant() {
        return pregnant;
    }

    public int giveBirth(){
        noOfChildren = ((int)(Math.random()*((14-1))) +1);

        return noOfChildren;

    }

}
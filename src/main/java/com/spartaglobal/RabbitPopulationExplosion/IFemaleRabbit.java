package com.spartaglobal.RabbitPopulationExplosion;

public interface IFemaleRabbit extends IRabbit{
    void setPregnant(boolean pregnant);
    boolean getPregnant();
    int giveBirth();
}

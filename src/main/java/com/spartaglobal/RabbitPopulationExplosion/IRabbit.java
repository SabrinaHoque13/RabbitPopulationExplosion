package com.spartaglobal.RabbitPopulationExplosion;

public interface IRabbit {
    boolean getMature();
    void setMature(boolean Mature);

    boolean getAlive();
    void setAlive(boolean alive);

    int getAge();
    void setAge(int age);

    int getYearOfBirth();
    void setYearOfBirth( int yearOfBirth);

}

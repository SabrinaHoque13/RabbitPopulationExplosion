package com.spartaglobal.RabbitPopulationExplosion;

public class Rabbit implements IRabbit{

    private int age;
    private boolean alive;
    private boolean mature;
    private int yearOfBirth;


    @Override
    public boolean getMature() {return this.mature;}

    @Override
    public void setMature(boolean mature) { this.mature = mature;}

    @Override
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public boolean getAlive() {
        return this.alive = alive;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    @Override
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}

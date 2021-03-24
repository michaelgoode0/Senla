package com.company.entities;

public abstract class Plant {
    protected double cost=0;
    protected String name="";
    public Plant( String name,double cost){
        this.cost=cost;
        this.name=name;
    }
    public Plant(){

    }
    public abstract void ColorOfFlower();

}

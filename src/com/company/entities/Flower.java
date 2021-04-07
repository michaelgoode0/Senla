package com.company.entities;
import com.company.enums.TypeOfFlowers;


public class Flower extends Plant {
    public TypeOfFlowers type;
    String name;
    double cost;

    public Flower(String name,double cost, TypeOfFlowers type) {
        this.type = type;
        this.name=name;
        this.cost=cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public TypeOfFlowers getType() {
        return type;
    }

    @Override
    public void getColorOfFlower() {
        System.out.print(type.toString());
    }
}
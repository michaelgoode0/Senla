package com.company.creator;

import com.company.entities.Flower;
import com.company.entities.Plant;
import com.company.enums.TypeOfFlowers;

public class CreateFlower extends Creator{
    @Override
    public Plant create(String name,double cost, TypeOfFlowers type){
        return new Flower(name,cost,type);
    }
}

package com.company.creator;

import com.company.entities.Plant;
import com.company.enums.TypeOfFlowers;

public abstract class Creator {
    public abstract Plant create (String name,double cost, TypeOfFlowers type);
}

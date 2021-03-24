package com.company;

import com.company.creator.CreateFlower;
import com.company.creator.Creator;
import com.company.entities.Bouquet;
import com.company.entities.Flower;
import com.company.entities.IBouquet;
import com.company.enums.TypeOfFlowers;

public class Main {

    public static void main(String[] args) {
        var creator=new CreateFlower();
        IBouquet bouquet=new Bouquet();
        bouquet.add((Flower) creator.create("Rose",5.5, TypeOfFlowers.RedFlower));
        bouquet.add((Flower) creator.create("Lily",3, TypeOfFlowers.WhiteFlower));
        bouquet.showFlowers();
        System.out.println("Цена букета "+bouquet.getCost());
    }
}

package com.company;

import com.company.creator.FlowerCreator;
import com.company.entities.Flower;
import com.company.enums.TypeOfFlowers;
import com.company.worker.Worker;

public class Main {

    public static void main(String[] args) {
        var creator=new FlowerCreator();
        var worker=new Worker();
        worker.add((Flower) creator.create("Rose",5.5, TypeOfFlowers.RED_FLOWER));
        worker.add((Flower) creator.create("Lily",3, TypeOfFlowers.WHITE_FLOWER));
        worker.showFlowers();
        System.out.println("Цена букета "+worker.getCost());
    }
}

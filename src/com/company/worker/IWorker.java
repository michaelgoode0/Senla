package com.company.worker;

import com.company.entities.Flower;

public interface IWorker {
    double getCost();
    void add(Flower flower);
    void showFlowers();
}

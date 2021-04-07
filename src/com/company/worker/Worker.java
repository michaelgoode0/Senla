package com.company.worker;

import com.company.entities.Bouquet;
import com.company.entities.Flower;

import java.sql.Wrapper;

public class Worker implements IWorker {
    public Worker(){

    }
    Bouquet bouquet=new Bouquet();

    public double getCost(){
        double sum=0;
        for (var i:bouquet.getItems()) {
            sum+=i.getCost();
        }
        return sum;
    }
    public void add(Flower flower){
        bouquet.getItems().add(flower);
    }
    public void showFlowers(){
        System.out.println("Цветы: ");
        for (var i: bouquet.getItems()) {
            System.out.print("Имя цветочка: "+ i.getName() +", " +
                    "Цена цветочка: " + i.getCost() +" "+
                    "Цвет цветочка: ");
            i.getColorOfFlower();
            System.out.println();
        }
    }


}

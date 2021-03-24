package com.company.entities;

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.ListIterator;

public class Bouquet implements IBouquet{
    private ArrayList<Flower> items;
    public Bouquet(){
        items=new ArrayList<Flower>();
    }
    public double getCost(){
        double sum=0;
        for (var i:items) {
            sum+=i.cost;
        }
        return sum;
    }
    public void add(Flower flower){
        items.add(flower);
    }
    public void showFlowers(){
        System.out.println("Цветы: ");
        for (var i: items) {
            System.out.print("Имя цветочка: "+ i.name +", " +
                    "Цена цветочка: " + i.cost +" "+
                    "Цвет цветочка: ");
            i.ColorOfFlower();
            System.out.println();
        }
    }



}

package com.company.entities;

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.ListIterator;

public class Bouquet {
    private ArrayList<Flower> items;
    public Bouquet(){
        items=new ArrayList<Flower>();
    }

    public ArrayList<Flower> getItems() {
        return items;
    }
}

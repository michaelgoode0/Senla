package com.company;

public class RandomGenerator {
    public int randomInt(){
        return (new java.util.Random()).nextInt(899)+100;
    }
}

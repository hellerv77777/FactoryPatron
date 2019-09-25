package com.hlabs.factorypatron;

public class Baguette implements Bread{

    @Override
    public String name() {
        return "Baguette";
    }

    @Override
    public String calorias() {
        return "250 Kcal";
    }
}

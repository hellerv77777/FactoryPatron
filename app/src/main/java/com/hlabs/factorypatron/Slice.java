package com.hlabs.factorypatron;

public class Slice implements Bread
{

    @Override
    public String name() {
        return "Pan de Molde";
    }

    @Override
    public String calorias() {
        return "350 Kcal";
    }
}

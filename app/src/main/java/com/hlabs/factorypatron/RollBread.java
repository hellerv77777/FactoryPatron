package com.hlabs.factorypatron;

public class RollBread implements Bread{


    @Override
    public String name() {
        return "Pan de Pita";
    }

    @Override
    public String calorias() {
        return "169 Kcal";
    }
}

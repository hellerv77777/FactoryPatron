package com.hlabs.factorypatron;

public class BreadFactory {

    public Bread getBread(String breadType)
    {
        if(breadType == "BAG")
        {
            return new Baguette();
        }
        else if(breadType=="ROL"){

            return new RollBread();

        }
        else if(breadType=="SLI") {

            return new Slice();

        }
        else {
            return null;
        }
    }
}

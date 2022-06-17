package Toppings;

import Fruit_juice.fruit_juce_Decorator;
import Fruit_juice.fruit_juice;

public class Vanilla_ice_cream extends fruit_juce_Decorator {

    public Vanilla_ice_cream(fruit_juice frute_juce) {
        super(frute_juce);
    }
    @Override
    public double getPrice() {
        return super.getPrice() + 50.00;
    }

    @Override
    public String getDiscription() {
        return super.getDiscription()+" with Vanilla Ice Cream";


    }
}

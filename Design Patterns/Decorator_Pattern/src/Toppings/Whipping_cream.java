package Toppings;

import Fruit_juice.fruit_juce_Decorator;
import Fruit_juice.fruit_juice;

public class Whipping_cream extends fruit_juce_Decorator {

    public Whipping_cream(fruit_juice frute_juce) {
        super(frute_juce);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 20.00;
    }

    @Override
    public String getDiscription() {
        return super.getDiscription()+" with Whipping Cream";


    }

}

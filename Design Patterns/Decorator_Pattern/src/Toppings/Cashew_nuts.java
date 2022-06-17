package Toppings;

import Fruit_juice.fruit_juce_Decorator;
import Fruit_juice.fruit_juice;

public class Cashew_nuts extends fruit_juce_Decorator {

    public Cashew_nuts(fruit_juice frute_juce) {
        super(frute_juce);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 10.00;
    }

    @Override
    public String getDiscription() {
        return super.getDiscription()+" with Cashew Nuts";


    }
}

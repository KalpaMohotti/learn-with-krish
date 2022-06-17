package Fruit_juice;

public abstract class fruit_juce_Decorator extends fruit_juice{
    private final fruit_juice frute_juce;

    public fruit_juce_Decorator(fruit_juice frute_juce) {
        this.frute_juce = frute_juce;
    }

    @Override
    public double getPrice() {
        return frute_juce.getPrice();
    }

    @Override
    public String getDiscription() {
        return frute_juce.getDiscription();
    }
}

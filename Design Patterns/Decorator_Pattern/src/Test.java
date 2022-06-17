import Fruit_juice.Avocado;
import Fruit_juice.Orange;
import Fruit_juice.fruit_juice;
import Toppings.Cashew_nuts;
import Toppings.Whipping_cream;

public class Test {
    public static void main(String[] args) {
        fruit_juice i = new Orange();
        i = new Whipping_cream(i);
        System.out.println(i.getPrice());
        System.out.println(i.getDiscription());

        fruit_juice ii = new Avocado();
        ii = new Cashew_nuts(ii);
        System.out.println(ii.getPrice());
        System.out.println(ii.getDiscription());
    }
}

import java.util.HashMap;

public class ColorFactory {
    private static final HashMap<Color, Car> pool = new HashMap<>();

    public static Car getColor(Color c) {
        Car a = pool.get(c);
        if (a == null) {
            a = new Car(c);
            pool.put(c, a);

        }
        return a;
    }
}

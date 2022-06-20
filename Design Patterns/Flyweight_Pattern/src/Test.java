public class Test {
    public static void main(String[] args) {

        Color red = new Color(255, 0, 0);   //RGB code
        Color green = new Color(0, 204, 0);
        Color blue = new Color(0, 0, 204);


        Car redCar = ColorFactory.getColor(red);
        Car redCar2 = ColorFactory.getColor( red);
        //Create blue color car
        Car blueCar=ColorFactory.getColor(blue);

        System.out.println("Blue color car hashCode");
        System.out.println(blueCar.hashCode());
        System.out.println("Red color cars hashCode");
        System.out.println(redCar.hashCode());
        System.out.println(redCar2.hashCode());

        System.out.println(redCar==redCar2);
        System.out.println(redCar==blueCar);


    }
}

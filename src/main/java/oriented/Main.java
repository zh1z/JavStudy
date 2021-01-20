package oriented;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getColor());
        car.hello("Mercedes");
        Bike bike = new Bike("美利达","sn750",1);
        System.out.println(bike.color);
    }
}

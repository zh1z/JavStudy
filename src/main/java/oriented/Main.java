package oriented;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getColor());
        car.hello("Mercedes");
        Bike bike = new Bike("美利达","sn750",1);
        System.out.println(bike.color);
        //向上转型
        Car carCast = bike;
        Object cast = carCast;
        //向下转型
        Bike bikeLow = (Bike)carCast;
        System.out.println(bikeLow instanceof Bike);

        //多态：针对某个类型的方法调用，其真正执行的方法取决于运行时期实际类型的方法。
        //多态具有一个非常强大的功能，就是允许添加更多类型的子类实现功能扩展，却不需要修改基于父类的代码。
        carCast.hello();
        car.hello();

    }
}

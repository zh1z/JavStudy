package oriented;

public class Bike extends Car{
    //通过继承，子类自动获得父类的所有字段，严禁定义与父类重名的字段
    protected int type;

    public String bikeColor(){
        //用protected修饰的字段和方法可以被其子类，以及子类的子类访问
        return "bike is" + color;
    }
    /*
    在java中，任何class的构造方法，第一行语句必须是调用父类的构造方法。
    如果没有明确地调用父类的构造方法，编译器会帮我们自动加一句super();
    如果父类没有默认的构造方法，子类就必须显式调用super()并给出参数以便让编译器定位到父类的一个合适的构造方法。
    子类不会继承任何父类的构造方法。子类默认的构造方法是编译器自动生成的，不是继承的;
     */
    public Bike(String model, String brand, int type){
//        super(brand, model);
        this.type = type;
    }

    public Bike(){

    }

    @Override
    public void hello(){
        System.out.println("hello,子类"+this.color);
    }
}

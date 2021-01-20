package oriented;

public class Car {
    //field
    private String model;
    private String brand;
    protected String color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCar(){
        return mergeCar();
    }
    private String mergeCar(){
        return this.brand+"\t"+this.model;
    }

    public Car(String brand, String model){
        this.model = model;
        this.brand = brand;
    }

    public Car(String color){
        this.color = color;
    }

    public Car(){
        //调用其他构造方法this(...)
        this("磨砂黑");
    }
    /*
    方法重载overload：方法名相同，但各自的参数不同
    重载方法应该完成类似的功能，参考String的indexOf()
    重载方法返回值类型应该相同
     */
    public void hello(){
        System.out.println("Mers");
    }

    public void hello(String name){
        System.out.println("Hello,"+ name);
    }
}

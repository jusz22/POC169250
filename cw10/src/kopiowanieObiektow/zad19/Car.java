package kopiowanieObiektow.zad19;

public class Car {
    private String make;
    private String model;
    private Engine engine;

    public Car(String make, String model, Engine engine) throws CloneNotSupportedException {
        this.make = make;
        this.model = model;
        this.engine = engine != null ? engine.clone() : new Engine(0, 0, "");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
    @Override
    public Car clone() throws CloneNotSupportedException{
        Car temp = (Car) super.clone();
        temp.engine = engine.clone();
        return temp;
    }
}

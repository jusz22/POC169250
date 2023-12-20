package kopiowanieObiektow.zad19;

public class TestCar {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("AA", "XX", new Engine(0, 0, "22"));
        Car car1 = car;
        System.out.println(car);
        System.out.println(car1);
        System.out.println(car == car1);
    }
}

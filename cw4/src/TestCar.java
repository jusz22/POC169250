public class TestCar {
    public static void main(String[] args) {
        Car Ferrari_Enzo = new Car();
        Ferrari_Enzo.speed = 239;
        Ferrari_Enzo.decelerate(30);
        System.out.println(Ferrari_Enzo.speed);
        Ferrari_Enzo.accelerate(100);
        System.out.println(Ferrari_Enzo.speed);
    }
}
class Car{
    String brand;
    String model;
    int speed;

    public int accelerate(int value){
        return speed += value;
    }
    public int decelerate(int value){
        return speed -= value;
    }
}
public class TestCar2 {
    public static void main(String[] args) {
        Car2 Punto = new Car2();
        Punto.brand = "dsada";
        if(Punto.brand != null)
            System.out.println(Punto.brand);
    }
}
class Car2{
    public String brand;
}

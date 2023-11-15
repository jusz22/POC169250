package pl.edu.uwm.akt6;

public class Laptop {
    private String brand;
    private int yearReleased;
    private double price;

    public Laptop(String brand, int yearReleased, double price){
        this.brand = brand;
        this.price = price;
        this.yearReleased = yearReleased;
    }
@Override
    public String toString(){
        return "Laptop. marka: " + brand + ", rok wydania: " + yearReleased + ", cena: " + price;
}
}

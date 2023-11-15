package pl.edu.uwm.zad2;

import java.time.Year;

public class Vehicle {
    private int yearOfProduction;
    private String brand;
    private String model;

    public Vehicle(String brand, String model, int yearOfProduction){
        this.brand = brand;
        if(brand == null || brand.equals(""))
            this.brand = "";
        this.model = model;
        if(model == null || model.equals(""))
            this.model = "";


        this.yearOfProduction = yearOfProduction;
        if (this.yearOfProduction > Year.now().getValue())
            this.yearOfProduction = Year.now().getValue();

    }
@Override
    public String toString(){
        return "Vehicle: " + brand + model + ", Year: " + yearOfProduction;
}
@Override
    public boolean equals(Object object){
        if(this == object) return true;
        if(object == null || object.getClass() != getClass()) return false;

        if(!brand.equals(((Vehicle) object).brand)) return false;
        if(yearOfProduction != ((Vehicle) object).yearOfProduction) return false;
        return model.equals(((Vehicle) object).model);

    }
@Override
    public int hashCode(){
        int result = brand.hashCode();
        result = result * 31 * + model.hashCode();
        result = 31 * result + yearOfProduction;
        return result;
}
}

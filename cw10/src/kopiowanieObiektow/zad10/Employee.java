package kopiowanieObiektow.zad10;

public class Employee implements Cloneable{
    private String name;
    private double salaries[];

    public Employee(String name, double[] salaries) {
        this.name = name;
        this.salaries = salaries;
    }
    public Employee clone(){

    }
}

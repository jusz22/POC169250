public class TestDog {
    public static void main(String[] args) {
        Dog azor = new Dog();
        azor.bark();
    }
}

class Dog {
    String name;
    String breed;
    int age;

    public void bark(){
        System.out.println("Wow Wow");
    }
}

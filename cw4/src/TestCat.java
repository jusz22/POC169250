public class TestCat {
    public static void main(String[] args) {
        Cat kot1 = Cat.createCat("Pankracy");
        System.out.println(kot1.name);
    }
}
class Cat{
    static String name;
    public static Cat createCat(String nameS){
        if(nameS != null) {
            name = nameS;
            return (new Cat());
        }
        return null;
    }
}

package progGeneryczne.zad2;

public class Main {
    public static void main(String[] args) {
        HisClass c1 = new HisClass();
        System.out.println(c1.isEqual(4, 5));
        System.out.println(c1.isEqual(6, 6));
        System.out.println(c1.isEqual("yur", "yur"));
        System.out.println(c1.isEqual(1.1, 1.1));
    }
}

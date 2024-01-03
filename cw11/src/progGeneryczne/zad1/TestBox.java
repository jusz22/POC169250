package progGeneryczne.zad1;

public class TestBox {
    public static void main(String[] args) {
        Box<Integer> i1 = new Box<>();
        i1.setElement(6);
        System.out.println(i1.getElement());
        Box<Integer> i2 = new Box<>(12);
        System.out.println(i2.getElement());
    }
}

package interfejsy.zad14;

public class DrawableTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        circle.draw();
        circle.display();
        System.out.println(Drawable.getType());
        rectangle.draw();
        rectangle.display();
    }
}

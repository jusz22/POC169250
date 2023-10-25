public class TestPoint {
    public static void main(String[] args) {
        Point a = new Point();
        Point b = new Point();
        a.x = 1;
        a.y = 2;
        b.x = -1;
        b.y = 4;
        System.out.println(a.distance(b));
    }
}

class Point{
    double x, y;
    public double distance(Point otherPoint){
        return Math.sqrt(Math.pow((otherPoint.x - x), 2) + Math.pow((otherPoint.y - y), 2));
    }
}

package Point;

public class main {
    public static void main(String[] args) {
        Point p1 = new Point(1,1);
        System.out.println(p1.toString());
        MovablePoint p2 = new MovablePoint(2,1,3,3);
        System.out.println(p2.toString());
        p2.move();
        System.out.println(p2.toString());

    }
}

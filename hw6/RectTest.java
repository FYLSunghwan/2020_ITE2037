class Point {
    private int x_, y_;
    public Point(int x, int y) {
        this.x_ = x;
        this.y_ = y;
    }

    public int getX() {
        return x_;
    }
    public int getY() {
        return y_;
    }
}

class Rect {
    private Point p1_, p2_;
    public Rect(int x1, int y1, int x2, int y2) {
        this.p1_ = new Point(x1, y1);
        this.p2_ = new Point(x2, y2);
    }
    public Rect(Point p1, Point p2) {
        this.p1_ = p1;
        this.p2_ = p2;
    }
    public Point getStart() {
        return this.p1_;
    }
    public Point getEnd() {
        return this.p2_;
    }
    public int getArea() {
        return Math.abs((p1_.getX() - p2_.getX())*(p1_.getY() - p2_.getY()));
    }
    public int getCircum() {
        return Math.abs(2*((p1_.getX() - p2_.getX()) + (p1_.getY() - p2_.getY())));
    }
}

public class RectTest {
    public static void main(String[] args) {
        Point p1 = new Point(10, 10);
        Point p2 = new Point(20, 20);
        Rect a = new Rect(p1, p2);
        System.out.print("시작점(" + a.getStart().getX() + "," + a.getStart().getY() + ")");
        System.out.println("끝점(" + a.getEnd().getX() + "," + a.getEnd().getY() + ")");
        System.out.println("넓이=" + a.getArea());
        System.out.println("둘레=" + a.getCircum());

        Rect b = new Rect(10, 10, 20, 20);
        System.out.print("시작점(" + b.getStart().getX() + "," + b.getStart().getY() + ")");
        System.out.println("끝점(" + b.getEnd().getX() + "," + b.getEnd().getY() + ")");
        System.out.println("넓이=" + b.getArea());
        System.out.println("둘레=" + b.getCircum());        
    }
}